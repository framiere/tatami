package fr.ippon.tatami.repository;

import java.util.Collection;

import fr.ippon.tatami.domain.Tweet;

/**
 * The User Respository.
 *
 * @author Julien Dubois
 */
public interface TweetRepository {

    Tweet createTweet(String login, String content);

    void addTweetToUserline(Tweet tweet);

    void addTweetToTimeline(String login, Tweet tweet);

    /** a user's and his followed users tweets */
    Collection<String> getTimeline(String login, int size);

    /** a users own tweets */
    Collection<String> getUserline(String login, int size);

    Tweet findTweetById(String tweetId);
}
