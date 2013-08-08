package test.twitter;

import java.io.IOException;
import java.util.LinkedList;
import java.util.jar.JarFile;

import org.apache.bcel.classfile.JavaClass;
import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eclectic.twitter2mentions$twitterListener;

import apimodel.ApiModelEasyDev;

import test.base.BaseTest;
import twitter4j.AsyncTwitter;
import twitter4j.AsyncTwitterFactory;
import twitter4j.DirectMessage;
import twitter4j.HashtagEntity;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.Twitter;
import twitter4j.TwitterAdapter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;
import twitter4j.conf.ConfigurationBuilder;

public class Twitter4JTest extends BaseTest {
	private static String accessToken       = "599482721-dSDOxxuOzWLLgLrkYqubYETVDdC5dLw2PH7gTUE";
	private static String accessTokenSecret = "wfF50dMWxM08wHm1UuHRGvR1c5vC7Dgqv7iKDUZA7Y";
	private static String consumerKey = "v8wuyd8CHn3aGoIJhTYLew";
	private static String consumerSecret = "BM0i55JmPHxLid29bjwe6JpFmnPWTQZDKf63GCrI6o";
	
	public static void main(String[] args) throws TwitterException, IOException {		
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		new Twitter4JTest().testMentions();
	    //new Twitter4JTest().learn();
	}
	

	public void testMentions() throws IOException {
		// configure twitter
		Twitter twitter = getAccount();
		
		// configure transformation
		eclectic.twitter2mentions transformation = new eclectic.twitter2mentions();

		Util.registerResourceFactory();

		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel out  = loader.basicEmptyModelFromFile(
				withDir("fixtures/metamodels/mention_graph.ecore"), 
				withDir("_tmp/mention_output.xmi")); 

		// TODO: HOW TO SELECT THE OBJECTS INVOLVED!!
		// VER COMO API2MOL SACA TODOS LOS OBJETOS!
		//ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		//ApiModel in = apiLoader.modelFromRoot(twitter, 
		//		withDir("src/test/twitter/twitter4j.apidesc"),
		//		new org.eclectic.apidesc.ApiDescriptionLanguageLoader());
		ApiModelEasyDev in = new ApiModelEasyDev(null, 
				(ApiDescription) new org.eclectic.apidesc.ApiDescriptionLanguageLoader().load(withDir("src/test/twitter/twitter4j.apidesc")), 
				new JavaListConverter());

		
		manager.register("twitter", in);
		manager.register("mentions", out);
		
		// Execute
		init("twitter2mention");
		transformation.setModelManager(manager);
		transformation.configure_();

		// configure twitter
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(false)
		  .setOAuthConsumerKey(consumerKey)
		  .setOAuthConsumerSecret(consumerSecret)
		  .setOAuthAccessToken(accessToken)
		  .setOAuthAccessTokenSecret(accessTokenSecret);
	
		transformation.setStreaming(10 * 1000);
		TwitterStream stream = new TwitterStreamFactory(cb.build()).getInstance();		
		twitter2mentions$twitterListener listener = transformation.createtwitterListener();
		stream.addListener(listener);
		stream.sample();
		
		transformation.start_();
		stream.shutdown();
		finish();
		out.serialize();
	}
	
	public void learn() throws TwitterException {
		Twitter twitter = getAccount();


			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(false)
			  .setOAuthConsumerKey(consumerKey)
			  .setOAuthConsumerSecret(consumerSecret)
			  .setOAuthAccessToken(accessToken)
			  .setOAuthAccessTokenSecret(accessTokenSecret);
		
			TwitterStream stream = new TwitterStreamFactory(cb.build()).getInstance();
			stream.addListener(new UserStreamListener() {
				
				@Override
				public void onException(Exception ex) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onStatus(Status status) {
					System.out.println(status);
					System.out.println(status.getUser());
					System.out.println(status.getHashtagEntities());
				}
				
				@Override
				public void onScrubGeo(long userId, long upToStatusId) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserProfileUpdate(User updatedUser) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserListUpdate(User listOwner, UserList list) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserListUnsubscription(User subscriber, User listOwner,
						UserList list) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserListSubscription(User subscriber, User listOwner,
						UserList list) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserListMemberDeletion(User deletedMember, User listOwner,
						UserList list) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserListMemberAddition(User addedMember, User listOwner,
						UserList list) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserListDeletion(User listOwner, UserList list) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUserListCreation(User listOwner, UserList list) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUnfavorite(User source, User target, Status unfavoritedStatus) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onUnblock(User source, User unblockedUser) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onRetweet(User source, User target, Status retweetedStatus) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onFriendList(long[] friendIds) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onFollow(User source, User followedUser) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onFavorite(User source, User target, Status favoritedStatus) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onDirectMessage(DirectMessage directMessage) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onDeletionNotice(long directMessageId, long userId) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onBlock(User source, User blockedUser) {
					// TODO Auto-generated method stub
					
				}
			});
			
			// stream.firehose(0);
			stream.sample();
			
		    //AsyncTwitterFactory factory = new AsyncTwitterFactory(cb.build());		    
		    //AsyncTwitter asyncTwitter = factory.getInstance();
		    //asyncTwitter.addListener(listener);
		    
		/*
		System.out.println( twitter.getHomeTimeline() );
		
		//for (Status status : twitter.getHomeTimeline()) {
		for (Status status : twitter.getPublicTimeline()) {
			
			//status.g
			HashtagEntity x = status.getHashtagEntities()[0];
			System.out.println(status.getText());
			//status.getUserMentionEntities()[0].getId();
		}
		*/		
	}
	
	public Twitter getAccount() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(false)
		  .setOAuthConsumerKey(consumerKey)
		  .setOAuthConsumerSecret(consumerSecret)
		  .setOAuthAccessToken(accessToken)
		  .setOAuthAccessTokenSecret(accessTokenSecret);
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();		
		return twitter;
	}
}
