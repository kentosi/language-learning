# Prepare-cards

Simple command-line utility to create cards for Anki.

Create the following file `prepare-cards` as an executable inside ~/bin with the following tweaked to your environment:
```
#!/bin/bash

/usr/local/Cellar/scala/2.10.2/bin/scala -classpath ~/apps/prepare-cards.jar com.kentosi.portuguese.PrepareCards $@
```

You can now bulk prepare Anki input cards. Eg - you might have the following file as `import-before.txt` with simple HTML:

```
This is the <b>front</b> of the card.
This is the reverse of the card.

This is another card's front.
This is the reverse.
Another line in the reserve of the card.
And another, till an empty line is encountered.
```

Now run the following:

```
prepare-cards import-before.txt > import-after.txt
```

This new `import-after.txt` can be imported easily into Anki.

