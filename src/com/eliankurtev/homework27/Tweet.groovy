
package com.eliankurtev.homework27

class Tweet {
    String username
    String tweetText
    Integer retweets
    Integer favorites
    Date createdOn

    Tweet(String user, String tweet){
        username = user
        tweetText = tweet
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }
    void addToRetweets(){
        retweets +=1
    }
    void addToFavorite(){
        favorites +=1
    }
}
