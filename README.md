# AdMobBug
Google AdMob has a bug with RewardedVideoAd, one thread here: https://groups.google.com/forum/#!topic/google-admob-ads-sdk/d8OEsg-P7Oo

Steps to reproduce:
1. Click the button to start the new activity. The ad button should work properly.
2. Hit back to exit the activity.
3. Click the button to start the activity again. The ad button now fails to show an ad.
