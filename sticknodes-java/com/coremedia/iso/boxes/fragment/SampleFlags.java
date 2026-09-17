package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class SampleFlags {
    private byte isLeading;
    private byte reserved;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private byte samplePaddingValue;

    public SampleFlags() {
            r0 = this;
            r0.<init>()
            return
    }

    public SampleFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r6.<init>()
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            r2 = -268435456(0xfffffffff0000000, double:NaN)
            long r2 = r2 & r0
            r7 = 28
            long r2 = r2 >> r7
            int r7 = (int) r2
            byte r7 = (byte) r7
            r6.reserved = r7
            r2 = 201326592(0xc000000, double:9.94685527E-316)
            long r2 = r2 & r0
            r7 = 26
            long r2 = r2 >> r7
            int r7 = (int) r2
            byte r7 = (byte) r7
            r6.isLeading = r7
            r2 = 50331648(0x3000000, double:2.4867138E-316)
            long r2 = r2 & r0
            r7 = 24
            long r2 = r2 >> r7
            int r7 = (int) r2
            byte r7 = (byte) r7
            r6.sampleDependsOn = r7
            r2 = 12582912(0xc00000, double:6.2167845E-317)
            long r2 = r2 & r0
            r7 = 22
            long r2 = r2 >> r7
            int r7 = (int) r2
            byte r7 = (byte) r7
            r6.sampleIsDependedOn = r7
            r2 = 3145728(0x300000, double:1.554196E-317)
            long r2 = r2 & r0
            r7 = 20
            long r2 = r2 >> r7
            int r7 = (int) r2
            byte r7 = (byte) r7
            r6.sampleHasRedundancy = r7
            r2 = 917504(0xe0000, double:4.53307E-318)
            long r2 = r2 & r0
            r7 = 17
            long r2 = r2 >> r7
            int r7 = (int) r2
            byte r7 = (byte) r7
            r6.samplePaddingValue = r7
            r2 = 65536(0x10000, double:3.2379E-319)
            long r2 = r2 & r0
            r7 = 16
            long r2 = r2 >> r7
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L58
            r7 = 1
            goto L59
        L58:
            r7 = 0
        L59:
            r6.sampleIsDifferenceSample = r7
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            int r7 = (int) r0
            r6.sampleDegradationPriority = r7
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L4d
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L4d
        L12:
            com.coremedia.iso.boxes.fragment.SampleFlags r5 = (com.coremedia.iso.boxes.fragment.SampleFlags) r5
            byte r2 = r4.isLeading
            byte r3 = r5.isLeading
            if (r2 == r3) goto L1b
            return r1
        L1b:
            byte r2 = r4.reserved
            byte r3 = r5.reserved
            if (r2 == r3) goto L22
            return r1
        L22:
            int r2 = r4.sampleDegradationPriority
            int r3 = r5.sampleDegradationPriority
            if (r2 == r3) goto L29
            return r1
        L29:
            byte r2 = r4.sampleDependsOn
            byte r3 = r5.sampleDependsOn
            if (r2 == r3) goto L30
            return r1
        L30:
            byte r2 = r4.sampleHasRedundancy
            byte r3 = r5.sampleHasRedundancy
            if (r2 == r3) goto L37
            return r1
        L37:
            byte r2 = r4.sampleIsDependedOn
            byte r3 = r5.sampleIsDependedOn
            if (r2 == r3) goto L3e
            return r1
        L3e:
            boolean r2 = r4.sampleIsDifferenceSample
            boolean r3 = r5.sampleIsDifferenceSample
            if (r2 == r3) goto L45
            return r1
        L45:
            byte r2 = r4.samplePaddingValue
            byte r5 = r5.samplePaddingValue
            if (r2 == r5) goto L4c
            return r1
        L4c:
            return r0
        L4d:
            return r1
    }

    public void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            byte r0 = r4.reserved
            int r0 = r0 << 28
            long r0 = (long) r0
            r2 = 0
            long r0 = r0 | r2
            byte r2 = r4.isLeading
            int r2 = r2 << 26
            long r2 = (long) r2
            long r0 = r0 | r2
            byte r2 = r4.sampleDependsOn
            int r2 = r2 << 24
            long r2 = (long) r2
            long r0 = r0 | r2
            byte r2 = r4.sampleIsDependedOn
            int r2 = r2 << 22
            long r2 = (long) r2
            long r0 = r0 | r2
            byte r2 = r4.sampleHasRedundancy
            int r2 = r2 << 20
            long r2 = (long) r2
            long r0 = r0 | r2
            byte r2 = r4.samplePaddingValue
            int r2 = r2 << 17
            long r2 = (long) r2
            long r0 = r0 | r2
            boolean r2 = r4.sampleIsDifferenceSample
            int r2 = r2 << 16
            long r2 = (long) r2
            long r0 = r0 | r2
            int r2 = r4.sampleDegradationPriority
            long r2 = (long) r2
            long r0 = r0 | r2
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            return
    }

    public byte getIsLeading() {
            r1 = this;
            byte r0 = r1.isLeading
            return r0
    }

    public int getReserved() {
            r1 = this;
            byte r0 = r1.reserved
            return r0
    }

    public int getSampleDegradationPriority() {
            r1 = this;
            int r0 = r1.sampleDegradationPriority
            return r0
    }

    public int getSampleDependsOn() {
            r1 = this;
            byte r0 = r1.sampleDependsOn
            return r0
    }

    public int getSampleHasRedundancy() {
            r1 = this;
            byte r0 = r1.sampleHasRedundancy
            return r0
    }

    public int getSampleIsDependedOn() {
            r1 = this;
            byte r0 = r1.sampleIsDependedOn
            return r0
    }

    public int getSamplePaddingValue() {
            r1 = this;
            byte r0 = r1.samplePaddingValue
            return r0
    }

    public int hashCode() {
            r2 = this;
            byte r0 = r2.reserved
            int r0 = r0 * 31
            byte r1 = r2.isLeading
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte r1 = r2.sampleDependsOn
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte r1 = r2.sampleIsDependedOn
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte r1 = r2.sampleHasRedundancy
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte r1 = r2.samplePaddingValue
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.sampleIsDifferenceSample
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.sampleDegradationPriority
            int r0 = r0 + r1
            return r0
    }

    public boolean isSampleIsDifferenceSample() {
            r1 = this;
            boolean r0 = r1.sampleIsDifferenceSample
            return r0
    }

    public void setIsLeading(byte r1) {
            r0 = this;
            r0.isLeading = r1
            return
    }

    public void setReserved(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.reserved = r1
            return
    }

    public void setSampleDegradationPriority(int r1) {
            r0 = this;
            r0.sampleDegradationPriority = r1
            return
    }

    public void setSampleDependsOn(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.sampleDependsOn = r1
            return
    }

    public void setSampleHasRedundancy(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.sampleHasRedundancy = r1
            return
    }

    public void setSampleIsDependedOn(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.sampleIsDependedOn = r1
            return
    }

    public void setSampleIsDifferenceSample(boolean r1) {
            r0 = this;
            r0.sampleIsDifferenceSample = r1
            return
    }

    public void setSamplePaddingValue(int r1) {
            r0 = this;
            byte r1 = (byte) r1
            r0.samplePaddingValue = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SampleFlags{reserved="
            r0.<init>(r1)
            byte r1 = r2.reserved
            r0.append(r1)
            java.lang.String r1 = ", isLeading="
            r0.append(r1)
            byte r1 = r2.isLeading
            r0.append(r1)
            java.lang.String r1 = ", depOn="
            r0.append(r1)
            byte r1 = r2.sampleDependsOn
            r0.append(r1)
            java.lang.String r1 = ", isDepOn="
            r0.append(r1)
            byte r1 = r2.sampleIsDependedOn
            r0.append(r1)
            java.lang.String r1 = ", hasRedundancy="
            r0.append(r1)
            byte r1 = r2.sampleHasRedundancy
            r0.append(r1)
            java.lang.String r1 = ", padValue="
            r0.append(r1)
            byte r1 = r2.samplePaddingValue
            r0.append(r1)
            java.lang.String r1 = ", isDiffSample="
            r0.append(r1)
            boolean r1 = r2.sampleIsDifferenceSample
            r0.append(r1)
            java.lang.String r1 = ", degradPrio="
            r0.append(r1)
            int r1 = r2.sampleDegradationPriority
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
