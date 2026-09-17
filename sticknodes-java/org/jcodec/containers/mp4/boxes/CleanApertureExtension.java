package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class CleanApertureExtension extends org.jcodec.containers.mp4.boxes.Box {
    private int apertureHeightDenominator;
    private int apertureHeightNumerator;
    private int apertureWidthDenominator;
    private int apertureWidthNumerator;
    private int horizOffsetDenominator;
    private int horizOffsetNumerator;
    private int vertOffsetDenominator;
    private int vertOffsetNumerator;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "clap"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.apertureWidthNumerator
            r2.putInt(r0)
            int r0 = r1.apertureWidthDenominator
            r2.putInt(r0)
            int r0 = r1.apertureHeightNumerator
            r2.putInt(r0)
            int r0 = r1.apertureHeightDenominator
            r2.putInt(r0)
            int r0 = r1.horizOffsetNumerator
            r2.putInt(r0)
            int r0 = r1.horizOffsetDenominator
            r2.putInt(r0)
            int r0 = r1.vertOffsetNumerator
            r2.putInt(r0)
            int r0 = r1.vertOffsetDenominator
            r2.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.getInt()
            r1.apertureWidthNumerator = r0
            int r0 = r2.getInt()
            r1.apertureWidthDenominator = r0
            int r0 = r2.getInt()
            r1.apertureHeightNumerator = r0
            int r0 = r2.getInt()
            r1.apertureHeightDenominator = r0
            int r0 = r2.getInt()
            r1.horizOffsetNumerator = r0
            int r0 = r2.getInt()
            r1.horizOffsetDenominator = r0
            int r0 = r2.getInt()
            r1.vertOffsetNumerator = r0
            int r2 = r2.getInt()
            r1.vertOffsetDenominator = r2
            return
    }
}
