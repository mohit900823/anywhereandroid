
# Anywhere-code-challenge
I have used
#### kotlin

## Tablet view
![CHEESE!](table_view.png)

## Mobile view
![CHEESE!](mobile_view.png)

### Project is build on:

- Android Studio Giraffe | 2022.3.1 Beta 3
- java 17

You must have newest Android Studio to run this Project



## Two productFlavors(for multiple apps)
- VersionOne
- VersionTwo
#### Description
- we can use different resource folder for different build flavor, for example if we want to use different color scheme, different launcher icon and many more

### VersionOne
- applicationId = "com.sample.simpsonsviewer"
- app_name = Version One
- API= http://api.duckduckgo.com/?q=simpsons+characters&format=json
### VersionTwo
- applicationId = "com.sample.wireviewer"
- app_name = Version Two
- API= http://api.duckduckgo.com/?q=simpsons+characters&format=json


### Fragments
- Navigation component used for  Navigation.
- I have created One Fragment for showing  list.
- other fragment to show the detail

### Architecture(MVVM)
- MVVM used as Architecture
- i have used Dagger hilt as dependency injection.
- Retrofit for calling API
### Tablet view
- For handling Tablet i have used SlidingPaneLayout which is google recommend
- [here](https://developer.android.com/develop/ui/views/layout/twopane) you can see the documentation 

