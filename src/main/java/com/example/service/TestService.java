package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

@Service
public class TestService {
	
	public String execute() {
//
//	        try {
//	            Twitter twitter = new TwitterFactory().getInstance();
//	            try {
//	                // get request token.
//	                // this will throw IllegalStateException if access token is already available
//	                RequestToken requestToken = twitter.getOAuthRequestToken();
//	                System.out.println("Got request token.");
//	                System.out.println("Request token: " + requestToken.getToken());
//	                System.out.println("Request token secret: " + requestToken.getTokenSecret());
//	                AccessToken accessToken = null;
//
//	                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	                while (null == accessToken) {
//	                    System.out.println("Open the following URL and grant access to your account:");
//	                    System.out.println(requestToken.getAuthorizationURL());
//	                    System.out.print("Enter the PIN(if available) and hit enter after you granted access.[PIN]:");
//	                    String pin = br.readLine();
//	                    try {
//	                        if (pin.length() > 0) {
//	                            accessToken = twitter.getOAuthAccessToken(requestToken, pin);
//	                        } else {
//	                            accessToken = twitter.getOAuthAccessToken(requestToken);
//	                        }
//	                    } catch (TwitterException te) {
//	                        if (401 == te.getStatusCode()) {
//	                            System.out.println("Unable to get the access token.");
//	                        } else {
//	                            te.printStackTrace();
//	                        }
//	                    }
//	                }
//	                System.out.println("Got access token.");
//	                System.out.println("Access token: " + accessToken.getToken());
//	                System.out.println("Access token secret: " + accessToken.getTokenSecret());
//	            } catch (IllegalStateException ie) {
//	                // access token is already available, or consumer key/secret is not set.
//	                if (!twitter.getAuthorization().isEnabled()) {
//	                    System.out.println("OAuth consumer key/secret is not set.");
//	                    System.exit(-1);
//	                }
//	            }
//	            Status status = twitter.updateStatus("tweet for java(twitter4J)");
//	            System.out.println("Successfully updated the status to [" + status.getText() + "].");
//	            System.exit(0);
//	        } catch (TwitterException te) {
//	            te.printStackTrace();
//	            System.out.println("Failed to get timeline: " + te.getMessage());
//	            System.exit(-1);
//	        } catch (IOException ioe) {
//	            ioe.printStackTrace();
//	            System.out.println("Failed to read the system input.");
//	            System.exit(-1);
//	        }
//	
		//	    // このファクトリインスタンスは再利用可能でスレッドセーフです
	    Twitter twitter = TwitterFactory.getSingleton();
	    Status status;
		try {
			//status = twitter.updateStatus("tweet for java(twitter4J)");
			status = twitter.updateStatus("twitter4Jでツイートしてみるテスト :-) ");
		    System.out.println("Successfully updated the status to [" + status.getText() + "].");

		} catch (TwitterException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		return "TestService.Execute!";
	}

}
