class Parcel {
  public int mWidth;
  public int mHeight;
  public int mLength;
  public int mWeight;
  public int mVolume;

  public Parcel(int width, int height, int length, int weight) {
    mWidth = width;
    mHeight = height;
    mLength = length;
    mWeight = weight;
  }

  public void volume(int width, int height, int length) {
    mVolume = width * height * length;
  }

  public float costToShip() {
    return (mVolume * .1);
  }
}
