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

  public void volume() {
    mVolume = mWidth * mHeight * mLength;
  }

  public int costToShip() {
    return ((mVolume * 2) * mWeight);
  }
}
