package entities;

public class EfeitoDoppler {
		public double fOb,f,v,vo,vf;
		
		public double efeitoDopler() {
			fOb = f*((v+vo)/(v+vf));
			return fOb;
		}
}