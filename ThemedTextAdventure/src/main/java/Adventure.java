import java.util.Scanner;

public class Adventure {
	public static int map[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	int startRowPos = (int) (Math.random() * 10);
	int startColPos = (int) (Math.random() * 10);

	int treasureRowPos = (int) (Math.random() * 10);
	int treasureColPos = (int) (Math.random() * 10);

	int gremlin1RowPos = (int) (Math.random() * 10);
	int gremlin1ColPos = (int) (Math.random() * 10);

	int gremlin2RowPos = (int) (Math.random() * 10);
	int gremlin2ColPos = (int) (Math.random() * 10);

	int gremlin3RowPos = (int) (Math.random() * 10);
	int gremlin3ColPos = (int) (Math.random() * 10);

	int gremlin4RowPos = (int) (Math.random() * 10);
	int gremlin4ColPos = (int) (Math.random() * 10);

	int gremlin5RowPos = (int) (Math.random() * 10);
	int gremlin5ColPos = (int) (Math.random() * 10);

	int gremlin6RowPos = (int) (Math.random() * 10);
	int gremlin6ColPos = (int) (Math.random() * 10);

	int gremlin7RowPos = (int) (Math.random() * 10);
	int gremlin7ColPos = (int) (Math.random() * 10);

	int gremlin8RowPos = (int) (Math.random() * 10);
	int gremlin8ColPos = (int) (Math.random() * 10);


	
	

	public void showMap() {
		for (int i = 0; i < Adventure.map.length; i++) {
			for (int j = 0; j < Adventure.map[i].length; j++) {
				System.out.print(Adventure.map[i][j]);
			}
			System.out.println();
		}
	}

	public void showStartPos() {
		map[startRowPos][startColPos] = 1;
		for (int i = 0; i < Adventure.map.length; i++) {
			for (int j = 0; j < Adventure.map[i].length; j++) {
				System.out.print(Adventure.map[i][j]);
			}
			System.out.println();
		}
	}


	public void showAllPos() {
		map[startRowPos][startColPos] = 1;
		map[treasureRowPos][treasureColPos] = 2;
		map[gremlin1RowPos][gremlin1ColPos] = 3;
		map[gremlin2RowPos][gremlin2ColPos] = 3;
		map[gremlin3RowPos][gremlin3ColPos] = 3;
		map[gremlin4RowPos][gremlin4ColPos] = 3;
		map[gremlin5RowPos][gremlin5ColPos] = 3;
		map[gremlin6RowPos][gremlin6ColPos] = 3;
		map[gremlin7RowPos][gremlin7ColPos] = 3;
		map[gremlin8RowPos][gremlin8ColPos] = 3;


		for (int i = 0; i < Adventure.map.length; i++) {
			for (int j = 0; j < Adventure.map[i].length; j++) {
				System.out.print(Adventure.map[i][j]);
			}
			System.out.println();
		}
	}

	public void beginAdventure() {
		System.out.println("Hello friend, do you think you could help me find Rudolph.");
		System.out.println("He's lost somewhere out in the forest.");
		System.out.println("Take this compass to help you find him.");
		System.out.println("Remember, you can only move 'North', 'East', 'South' or 'West'.");
		System.out.println("And watch out for those pesky Gremlins");
		
		while (startRowPos != treasureRowPos || startColPos != treasureColPos) {
			showStartPos();
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			if ((input.compareToIgnoreCase("north") == 0) || (input.compareToIgnoreCase("east") == 0)
					|| (input.compareToIgnoreCase("south") == 0) || (input.compareToIgnoreCase("west")) == 0) {
				System.out.println(">" + input);
				if (input.compareToIgnoreCase("north") == 0) {
					if ((startRowPos - 1== gremlin1RowPos && startColPos == gremlin1ColPos)||
							(startRowPos - 1== gremlin2RowPos && startColPos == gremlin2ColPos)||
							(startRowPos - 1== gremlin3RowPos && startColPos == gremlin3ColPos)||
							(startRowPos - 1== gremlin4RowPos && startColPos == gremlin4ColPos)||
							(startRowPos - 1== gremlin5RowPos && startColPos == gremlin5ColPos)||
							(startRowPos - 1== gremlin6RowPos && startColPos == gremlin6ColPos)||
							(startRowPos - 1== gremlin7RowPos && startColPos == gremlin7ColPos)||
							(startRowPos - 1== gremlin8RowPos && startColPos == gremlin8ColPos))
					{
						System.out.println("AAHHH!! A GREMLIN!");
					} else {
						map[startRowPos][startColPos] = 0;
						startRowPos -= 1;
						map[startRowPos][startColPos] = 1;
					}
				} else if (input.compareToIgnoreCase("south") == 0) {
					if ((startRowPos + 1== gremlin1RowPos && startColPos == gremlin1ColPos)||
							(startRowPos + 1== gremlin2RowPos && startColPos == gremlin2ColPos)||
							(startRowPos + 1== gremlin3RowPos && startColPos == gremlin3ColPos)||
							(startRowPos + 1== gremlin4RowPos && startColPos == gremlin4ColPos)||
							(startRowPos + 1== gremlin5RowPos && startColPos == gremlin5ColPos)||
							(startRowPos + 1== gremlin6RowPos && startColPos == gremlin6ColPos)||
							(startRowPos + 1== gremlin7RowPos && startColPos == gremlin7ColPos)||
							(startRowPos + 1== gremlin8RowPos && startColPos == gremlin8ColPos)) {
						System.out.println("AAHHH!! A GREMLIN!");
					} else {
						map[startRowPos][startColPos] = 0;
						startRowPos += 1;
						map[startRowPos][startColPos] = 1;
					}
				} else if (input.compareToIgnoreCase("east") == 0) {
					if ((startRowPos == gremlin1RowPos && startColPos + 1 == gremlin1ColPos)||
							(startRowPos == gremlin2RowPos && startColPos + 1 == gremlin2ColPos)||
							(startRowPos == gremlin3RowPos && startColPos + 1 == gremlin3ColPos)||
							(startRowPos == gremlin4RowPos && startColPos + 1 == gremlin4ColPos)||
							(startRowPos == gremlin5RowPos && startColPos + 1 == gremlin5ColPos)||
							(startRowPos == gremlin6RowPos && startColPos + 1 == gremlin6ColPos)||
							(startRowPos == gremlin7RowPos && startColPos + 1 == gremlin7ColPos)||
							(startRowPos == gremlin8RowPos && startColPos + 1 == gremlin8ColPos)) {
						System.out.println("AAHHH!! A GREMLIN!");
					} else {
						map[startRowPos][startColPos] = 0;
						startColPos += 1;
						map[startRowPos][startColPos] = 1;
					}
				} else if (input.compareToIgnoreCase("west") == 0) {
					if ((startRowPos == gremlin1RowPos && startColPos - 1 == gremlin1ColPos)||
							(startRowPos == gremlin2RowPos && startColPos - 1 == gremlin2ColPos)||
							(startRowPos == gremlin3RowPos && startColPos - 1 == gremlin3ColPos)||
							(startRowPos == gremlin4RowPos && startColPos - 1 == gremlin4ColPos)||
							(startRowPos == gremlin5RowPos && startColPos - 1 == gremlin5ColPos)||
							(startRowPos == gremlin6RowPos && startColPos - 1 == gremlin6ColPos)||
							(startRowPos == gremlin7RowPos && startColPos - 1 == gremlin7ColPos)||
							(startRowPos == gremlin8RowPos && startColPos - 1 == gremlin8ColPos)) {
						System.out.println("AAHHH!! A GREMLIN!");
					} else {
						map[startRowPos][startColPos] = 0;
						startColPos -= 1;
						map[startRowPos][startColPos] = 1;
					}
				}
			} else {
				System.out.println("Sorry, I do not know that direction.");
			}
		}
		System.out.println("Congratulations! You Found Rudolph!");
	}
}
