package com.mp4parser.iso14496.part15;

/* loaded from: classes2.dex */
public class TemporalLayerSampleGroup extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "tscl";
    int temporalLayerId;
    int tlAvgBitRate;
    int tlAvgFrameRate;
    int tlConstantFrameRate;
    int tlMaxBitRate;
    long tlconstraint_indicator_flags;
    int tllevel_idc;
    long tlprofile_compatibility_flags;
    int tlprofile_idc;
    int tlprofile_space;
    boolean tltier_flag;

    public TemporalLayerSampleGroup() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L66
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L12
            goto L66
        L12:
            com.mp4parser.iso14496.part15.TemporalLayerSampleGroup r8 = (com.mp4parser.iso14496.part15.TemporalLayerSampleGroup) r8
            int r2 = r7.temporalLayerId
            int r3 = r8.temporalLayerId
            if (r2 == r3) goto L1b
            return r1
        L1b:
            int r2 = r7.tlAvgBitRate
            int r3 = r8.tlAvgBitRate
            if (r2 == r3) goto L22
            return r1
        L22:
            int r2 = r7.tlAvgFrameRate
            int r3 = r8.tlAvgFrameRate
            if (r2 == r3) goto L29
            return r1
        L29:
            int r2 = r7.tlConstantFrameRate
            int r3 = r8.tlConstantFrameRate
            if (r2 == r3) goto L30
            return r1
        L30:
            int r2 = r7.tlMaxBitRate
            int r3 = r8.tlMaxBitRate
            if (r2 == r3) goto L37
            return r1
        L37:
            long r2 = r7.tlconstraint_indicator_flags
            long r4 = r8.tlconstraint_indicator_flags
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L40
            return r1
        L40:
            int r2 = r7.tllevel_idc
            int r3 = r8.tllevel_idc
            if (r2 == r3) goto L47
            return r1
        L47:
            long r2 = r7.tlprofile_compatibility_flags
            long r4 = r8.tlprofile_compatibility_flags
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L50
            return r1
        L50:
            int r2 = r7.tlprofile_idc
            int r3 = r8.tlprofile_idc
            if (r2 == r3) goto L57
            return r1
        L57:
            int r2 = r7.tlprofile_space
            int r3 = r8.tlprofile_space
            if (r2 == r3) goto L5e
            return r1
        L5e:
            boolean r2 = r7.tltier_flag
            boolean r8 = r8.tltier_flag
            if (r2 == r8) goto L65
            return r1
        L65:
            return r0
        L66:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r3 = this;
            r0 = 20
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.temporalLayerId
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.tlprofile_space
            int r1 = r1 << 6
            boolean r2 = r3.tltier_flag
            if (r2 == 0) goto L16
            r2 = 32
            goto L17
        L16:
            r2 = 0
        L17:
            int r1 = r1 + r2
            int r2 = r3.tlprofile_idc
            int r1 = r1 + r2
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            long r1 = r3.tlprofile_compatibility_flags
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r3.tlconstraint_indicator_flags
            com.coremedia.iso.IsoTypeWriter.writeUInt48(r0, r1)
            int r1 = r3.tllevel_idc
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.tlMaxBitRate
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.tlAvgBitRate
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            int r1 = r3.tlConstantFrameRate
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.tlAvgFrameRate
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
    }

    public int getTemporalLayerId() {
            r1 = this;
            int r0 = r1.temporalLayerId
            return r0
    }

    public int getTlAvgBitRate() {
            r1 = this;
            int r0 = r1.tlAvgBitRate
            return r0
    }

    public int getTlAvgFrameRate() {
            r1 = this;
            int r0 = r1.tlAvgFrameRate
            return r0
    }

    public int getTlConstantFrameRate() {
            r1 = this;
            int r0 = r1.tlConstantFrameRate
            return r0
    }

    public int getTlMaxBitRate() {
            r1 = this;
            int r0 = r1.tlMaxBitRate
            return r0
    }

    public long getTlconstraint_indicator_flags() {
            r2 = this;
            long r0 = r2.tlconstraint_indicator_flags
            return r0
    }

    public int getTllevel_idc() {
            r1 = this;
            int r0 = r1.tllevel_idc
            return r0
    }

    public long getTlprofile_compatibility_flags() {
            r2 = this;
            long r0 = r2.tlprofile_compatibility_flags
            return r0
    }

    public int getTlprofile_idc() {
            r1 = this;
            int r0 = r1.tlprofile_idc
            return r0
    }

    public int getTlprofile_space() {
            r1 = this;
            int r0 = r1.tlprofile_space
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "tscl"
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.temporalLayerId
            int r0 = r0 * 31
            int r1 = r6.tlprofile_space
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.tltier_flag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.tlprofile_idc
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.tlprofile_compatibility_flags
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.tlconstraint_indicator_flags
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.tllevel_idc
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.tlMaxBitRate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.tlAvgBitRate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.tlConstantFrameRate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.tlAvgFrameRate
            int r0 = r0 + r1
            return r0
    }

    public boolean isTltier_flag() {
            r1 = this;
            boolean r0 = r1.tltier_flag
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.temporalLayerId = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r1 = r0 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> 6
            r2.tlprofile_space = r1
            r1 = r0 & 32
            if (r1 <= 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r2.tltier_flag = r1
            r0 = r0 & 31
            r2.tlprofile_idc = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.tlprofile_compatibility_flags = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt48(r3)
            r2.tlconstraint_indicator_flags = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.tllevel_idc = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            r2.tlMaxBitRate = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            r2.tlAvgBitRate = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.tlConstantFrameRate = r0
            int r3 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            r2.tlAvgFrameRate = r3
            return
    }

    public void setTemporalLayerId(int r1) {
            r0 = this;
            r0.temporalLayerId = r1
            return
    }

    public void setTlAvgBitRate(int r1) {
            r0 = this;
            r0.tlAvgBitRate = r1
            return
    }

    public void setTlAvgFrameRate(int r1) {
            r0 = this;
            r0.tlAvgFrameRate = r1
            return
    }

    public void setTlConstantFrameRate(int r1) {
            r0 = this;
            r0.tlConstantFrameRate = r1
            return
    }

    public void setTlMaxBitRate(int r1) {
            r0 = this;
            r0.tlMaxBitRate = r1
            return
    }

    public void setTlconstraint_indicator_flags(long r1) {
            r0 = this;
            r0.tlconstraint_indicator_flags = r1
            return
    }

    public void setTllevel_idc(int r1) {
            r0 = this;
            r0.tllevel_idc = r1
            return
    }

    public void setTlprofile_compatibility_flags(long r1) {
            r0 = this;
            r0.tlprofile_compatibility_flags = r1
            return
    }

    public void setTlprofile_idc(int r1) {
            r0 = this;
            r0.tlprofile_idc = r1
            return
    }

    public void setTlprofile_space(int r1) {
            r0 = this;
            r0.tlprofile_space = r1
            return
    }

    public void setTltier_flag(boolean r1) {
            r0 = this;
            r0.tltier_flag = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public int size() {
            r1 = this;
            r0 = 20
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TemporalLayerSampleGroup{temporalLayerId="
            r0.<init>(r1)
            int r1 = r3.temporalLayerId
            r0.append(r1)
            java.lang.String r1 = ", tlprofile_space="
            r0.append(r1)
            int r1 = r3.tlprofile_space
            r0.append(r1)
            java.lang.String r1 = ", tltier_flag="
            r0.append(r1)
            boolean r1 = r3.tltier_flag
            r0.append(r1)
            java.lang.String r1 = ", tlprofile_idc="
            r0.append(r1)
            int r1 = r3.tlprofile_idc
            r0.append(r1)
            java.lang.String r1 = ", tlprofile_compatibility_flags="
            r0.append(r1)
            long r1 = r3.tlprofile_compatibility_flags
            r0.append(r1)
            java.lang.String r1 = ", tlconstraint_indicator_flags="
            r0.append(r1)
            long r1 = r3.tlconstraint_indicator_flags
            r0.append(r1)
            java.lang.String r1 = ", tllevel_idc="
            r0.append(r1)
            int r1 = r3.tllevel_idc
            r0.append(r1)
            java.lang.String r1 = ", tlMaxBitRate="
            r0.append(r1)
            int r1 = r3.tlMaxBitRate
            r0.append(r1)
            java.lang.String r1 = ", tlAvgBitRate="
            r0.append(r1)
            int r1 = r3.tlAvgBitRate
            r0.append(r1)
            java.lang.String r1 = ", tlConstantFrameRate="
            r0.append(r1)
            int r1 = r3.tlConstantFrameRate
            r0.append(r1)
            java.lang.String r1 = ", tlAvgFrameRate="
            r0.append(r1)
            int r1 = r3.tlAvgFrameRate
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
