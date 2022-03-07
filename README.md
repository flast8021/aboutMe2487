Full Name:  Usman Zia
Student Id: 24087

✓ Main Activity (or Launcher Activity)
✓ Button Links open new Activity 
✓ Home icon opens Main Activity from back-stack instead of creating newly
✓ Exit Button finishes the activity and closes the app
✓ Text is not hardcoded in the layout but is present in "strings" resources xml file
✓ Image Assets
✓ Images (Raster) are used
✓ Vector icons (inbuilt material icons) are used
✓ SVG icon is used
Extra:
✓ Toast used while exiting thriugh application
✓ Gradient coloring used as background

Report:

Introduction:
I've complete about me application that consists total of 5 pages 
1. Main page that has four buttons 
	1.Education
	2.Skills
	3.Hobbies
	4.Achievements
2.The next page i worked on is Education page, which contains pictures and some text relating to my college/universities where I've studied.
3.The next page I worked is Skills Like Education activity it contains same stuff some pictures and some text, explaining what skills I have and what keep me motivated.
4.The next page contains I like to do in my free times like hobbies I’ve added couple of hobbies which I’ve since a long time.
5.The last activity I added has achievements that I’ve achieved so far in my life like certifications and stuff.
Explanation & Difficulties:
All of these activities has a nice gradient background, which is consistent throughout the layouts, I added an exit button which finishes the activity whatsoever on which activity you’re it’ll just exit the application.
Also talking of exit button I added new .xml file which has item tag in it in order to describe properties of certain toolbar. As I searched a lot and couldn’t found another way of adding icons at toolbar so I had to add a new source file to get the icon up and running. Which actually worked so I didn’t had to struggle a lot for the toolbar icon.
For buttons I linked each button with respective activity layouts like on clicking education button it’ll take you to education page and then on education page it’ll have button for skills and home depending on what you click it’ll take you to responding activity/page.
Other than that the problem that I faced was adding binary to GitHub, which isn’t been solved for so I had to add to zip the file and then I had to add my app-debug.apk into zip file in order to upload the release up on GitHub.
Which did the job for me, lastly I also faced a problem with virtual device not working so I had to delete file with .lock extension which didn’t worked for me so as a result I end up installing new virtual device same one that I had before, which was functional so I did my screencast on new device.
Conclusion:
To conclude this project lead to a lot of leaning and has proven a good practice, during this process the difficulties I faced and encounter are mention above which was solved with and hence resulted in a proper working application.

Refrences:
https://www.youtube.com/watch?v=SbNQxPDUWaI
https://www.youtube.com/watch?v=NXLHVF06AZ4&t=251s
https://stackoverflow.com/questions/55599876/error-attribute-package-in-manifest-tag-is-not-a-valid-android-package-name
https://developer.android.com/studio/run/managing-avds

