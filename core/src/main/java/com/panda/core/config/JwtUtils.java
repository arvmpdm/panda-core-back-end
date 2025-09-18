package com.panda.core.config;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.enterprise.context.ApplicationScoped;
import java.security.Key;
import java.util.Date;

@ApplicationScoped
public class JwtUtils {

	private final Key SECRET_KEY=Keys.secretKeyFor(
			SignatureAlgorithm.HS256);
	
	private final long EXPIRATION_TIME=3600000;
	
	public String generateToken(String username) {
		
		return Jwts.builder()
				 .setSubject(username)
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
	                .signWith(SECRET_KEY)
	                .compact();
		
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parserBuilder()
			.setSigningKey(SECRET_KEY)
	        .build()
	        .parseClaimsJws(token);
			return true;
		}catch(Exception e) {
			return false;
		}
		
		
	}
	
	
	public String getUserNameFromToken(String token) {
		Claims claims=Jwts.parserBuilder()
				.setSigningKey(SECRET_KEY)
                .build()
                .parseClaimsJws(token)
                .getBody();
		return claims.getSubject();
	}
}
