package ir.javacup.contest.zoo;
public class CageCopier {

	public void copy(Cage c1, Cage c2) {

		if (c1 != null && c2 != null) {
			Bird[] temp = null;

			if(c1.getBirds() != null)
				temp = new Bird[2];


			if (c1.getBirds()[0] != null && c1.getBirds() != null)
				temp[0] = new Bird();


			if (c1.getBirds()[1] != null && c1.getBirds() != null)
				temp[1] = new Bird();



			String tmpBirdName1 = null;
			if(c1.getBirds()[0] != null && c1.getBirds() != null)
				tmpBirdName1 = new String(c1.getBirds()[0].getName());

			String tmpBirdName2 = null;
			if(c1.getBirds()[1] != null && c1.getBirds() != null)
				tmpBirdName2 = new String(c1.getBirds()[1].getName());

			String tmpBirdColor1 = null;
			if(c1.getBirds()[0] != null && c1.getBirds() != null)
				tmpBirdColor1 = new String(c1.getBirds()[0].getColor());

			String tmpBirdColor2 = null;
			if(c1.getBirds()[1] != null && c1.getBirds() != null)
				tmpBirdColor2 = new String(c1.getBirds()[1].getColor());

			if (c1.getBirds()[0] != null && c1.getBirds() != null)
				temp[0].setName(tmpBirdName1);

			if (c1.getBirds()[1] != null && c1.getBirds() != null)
				temp[1].setName(tmpBirdName2);

			if (c1.getBirds()[0] != null && c1.getBirds() != null)
				temp[0].setColor(tmpBirdColor1);

			if (c1.getBirds()[1] != null && c1.getBirds() != null)
				temp[1].setColor(tmpBirdColor2);

			c2.setBirds(temp);

			c2.setId(c1.getId());
			String tmpCageName = new String(c1.getName());
			c2.setName(tmpCageName);
		}
	}
}