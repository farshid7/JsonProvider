# JsonProvider
jsonProvider
this library help to create easy Json.
by this you can up to 15 key Value code in one Json
How to use:

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency

	dependencies {
	        compile 'com.github.farshid7:JsonProvider:1.0'
	}
  
  Step 3. Create Json
  
         JSONObject jsonObject= JsonProvider.buildJsonObject("Key","Value");

  
