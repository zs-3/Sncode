package com.mp4parser.iso14496.part15;

/* loaded from: classes2.dex */
public class HevcDecoderConfigurationRecord {
    java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array> arrays;
    int avgFrameRate;
    int bitDepthChromaMinus8;
    int bitDepthLumaMinus8;
    int chromaFormat;
    int configurationVersion;
    int constantFrameRate;
    boolean frame_only_constraint_flag;
    long general_constraint_indicator_flags;
    int general_level_idc;
    long general_profile_compatibility_flags;
    int general_profile_idc;
    int general_profile_space;
    boolean general_tier_flag;
    boolean interlaced_source_flag;
    int lengthSizeMinusOne;
    int min_spatial_segmentation_idc;
    boolean non_packed_constraint_flag;
    int numTemporalLayers;
    int parallelismType;
    boolean progressive_source_flag;
    int reserved1;
    int reserved2;
    int reserved3;
    int reserved4;
    int reserved5;
    boolean temporalIdNested;

    public static class Array {
        public boolean array_completeness;
        public java.util.List<byte[]> nalUnits;
        public int nal_unit_type;
        public boolean reserved;

        public Array() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                r1 = 0
                if (r6 == 0) goto L68
                java.lang.Class r2 = r5.getClass()
                java.lang.Class r3 = r6.getClass()
                if (r2 == r3) goto L12
                goto L68
            L12:
                com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r6 = (com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array) r6
                boolean r2 = r5.array_completeness
                boolean r3 = r6.array_completeness
                if (r2 == r3) goto L1b
                return r1
            L1b:
                int r2 = r5.nal_unit_type
                int r3 = r6.nal_unit_type
                if (r2 == r3) goto L22
                return r1
            L22:
                boolean r2 = r5.reserved
                boolean r3 = r6.reserved
                if (r2 == r3) goto L29
                return r1
            L29:
                java.util.List<byte[]> r2 = r5.nalUnits
                java.util.ListIterator r2 = r2.listIterator()
                java.util.List<byte[]> r6 = r6.nalUnits
                java.util.ListIterator r6 = r6.listIterator()
            L35:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5a
                boolean r3 = r6.hasNext()
                if (r3 != 0) goto L42
                goto L5a
            L42:
                java.lang.Object r3 = r2.next()
                byte[] r3 = (byte[]) r3
                java.lang.Object r4 = r6.next()
                byte[] r4 = (byte[]) r4
                if (r3 != 0) goto L53
                if (r4 == 0) goto L35
                goto L59
            L53:
                boolean r3 = java.util.Arrays.equals(r3, r4)
                if (r3 != 0) goto L35
            L59:
                return r1
            L5a:
                boolean r2 = r2.hasNext()
                if (r2 != 0) goto L66
                boolean r6 = r6.hasNext()
                if (r6 == 0) goto L67
            L66:
                r0 = 0
            L67:
                return r0
            L68:
                return r1
        }

        public int hashCode() {
                r2 = this;
                boolean r0 = r2.array_completeness
                int r0 = r0 * 31
                boolean r1 = r2.reserved
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.nal_unit_type
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<byte[]> r1 = r2.nalUnits
                if (r1 == 0) goto L17
                int r1 = r1.hashCode()
                goto L18
            L17:
                r1 = 0
            L18:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Array{nal_unit_type="
                r0.<init>(r1)
                int r1 = r2.nal_unit_type
                r0.append(r1)
                java.lang.String r1 = ", reserved="
                r0.append(r1)
                boolean r1 = r2.reserved
                r0.append(r1)
                java.lang.String r1 = ", array_completeness="
                r0.append(r1)
                boolean r1 = r2.array_completeness
                r0.append(r1)
                java.lang.String r1 = ", num_nals="
                r0.append(r1)
                java.util.List<byte[]> r1 = r2.nalUnits
                int r1 = r1.size()
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public HevcDecoderConfigurationRecord() {
            r1 = this;
            r1.<init>()
            r0 = 15
            r1.reserved1 = r0
            r0 = 63
            r1.reserved2 = r0
            r1.reserved3 = r0
            r0 = 31
            r1.reserved4 = r0
            r1.reserved5 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.arrays = r0
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto Lc4
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L13
            goto Lc4
        L13:
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord r8 = (com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord) r8
            int r2 = r7.avgFrameRate
            int r3 = r8.avgFrameRate
            if (r2 == r3) goto L1c
            return r1
        L1c:
            int r2 = r7.bitDepthChromaMinus8
            int r3 = r8.bitDepthChromaMinus8
            if (r2 == r3) goto L23
            return r1
        L23:
            int r2 = r7.bitDepthLumaMinus8
            int r3 = r8.bitDepthLumaMinus8
            if (r2 == r3) goto L2a
            return r1
        L2a:
            int r2 = r7.chromaFormat
            int r3 = r8.chromaFormat
            if (r2 == r3) goto L31
            return r1
        L31:
            int r2 = r7.configurationVersion
            int r3 = r8.configurationVersion
            if (r2 == r3) goto L38
            return r1
        L38:
            int r2 = r7.constantFrameRate
            int r3 = r8.constantFrameRate
            if (r2 == r3) goto L3f
            return r1
        L3f:
            long r2 = r7.general_constraint_indicator_flags
            long r4 = r8.general_constraint_indicator_flags
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L48
            return r1
        L48:
            int r2 = r7.general_level_idc
            int r3 = r8.general_level_idc
            if (r2 == r3) goto L4f
            return r1
        L4f:
            long r2 = r7.general_profile_compatibility_flags
            long r4 = r8.general_profile_compatibility_flags
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L58
            return r1
        L58:
            int r2 = r7.general_profile_idc
            int r3 = r8.general_profile_idc
            if (r2 == r3) goto L5f
            return r1
        L5f:
            int r2 = r7.general_profile_space
            int r3 = r8.general_profile_space
            if (r2 == r3) goto L66
            return r1
        L66:
            boolean r2 = r7.general_tier_flag
            boolean r3 = r8.general_tier_flag
            if (r2 == r3) goto L6d
            return r1
        L6d:
            int r2 = r7.lengthSizeMinusOne
            int r3 = r8.lengthSizeMinusOne
            if (r2 == r3) goto L74
            return r1
        L74:
            int r2 = r7.min_spatial_segmentation_idc
            int r3 = r8.min_spatial_segmentation_idc
            if (r2 == r3) goto L7b
            return r1
        L7b:
            int r2 = r7.numTemporalLayers
            int r3 = r8.numTemporalLayers
            if (r2 == r3) goto L82
            return r1
        L82:
            int r2 = r7.parallelismType
            int r3 = r8.parallelismType
            if (r2 == r3) goto L89
            return r1
        L89:
            int r2 = r7.reserved1
            int r3 = r8.reserved1
            if (r2 == r3) goto L90
            return r1
        L90:
            int r2 = r7.reserved2
            int r3 = r8.reserved2
            if (r2 == r3) goto L97
            return r1
        L97:
            int r2 = r7.reserved3
            int r3 = r8.reserved3
            if (r2 == r3) goto L9e
            return r1
        L9e:
            int r2 = r7.reserved4
            int r3 = r8.reserved4
            if (r2 == r3) goto La5
            return r1
        La5:
            int r2 = r7.reserved5
            int r3 = r8.reserved5
            if (r2 == r3) goto Lac
            return r1
        Lac:
            boolean r2 = r7.temporalIdNested
            boolean r3 = r8.temporalIdNested
            if (r2 == r3) goto Lb3
            return r1
        Lb3:
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r2 = r7.arrays
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r8 = r8.arrays
            if (r2 == 0) goto Lc0
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto Lc3
            goto Lc2
        Lc0:
            if (r8 == 0) goto Lc3
        Lc2:
            return r1
        Lc3:
            return r0
        Lc4:
            return r1
    }

    public java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array> getArrays() {
            r1 = this;
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r0 = r1.arrays
            return r0
    }

    public int getAvgFrameRate() {
            r1 = this;
            int r0 = r1.avgFrameRate
            return r0
    }

    public int getBitDepthChromaMinus8() {
            r1 = this;
            int r0 = r1.bitDepthChromaMinus8
            return r0
    }

    public int getBitDepthLumaMinus8() {
            r1 = this;
            int r0 = r1.bitDepthLumaMinus8
            return r0
    }

    public int getChromaFormat() {
            r1 = this;
            int r0 = r1.chromaFormat
            return r0
    }

    public int getConfigurationVersion() {
            r1 = this;
            int r0 = r1.configurationVersion
            return r0
    }

    public int getConstantFrameRate() {
            r1 = this;
            int r0 = r1.constantFrameRate
            return r0
    }

    public long getGeneral_constraint_indicator_flags() {
            r2 = this;
            long r0 = r2.general_constraint_indicator_flags
            return r0
    }

    public int getGeneral_level_idc() {
            r1 = this;
            int r0 = r1.general_level_idc
            return r0
    }

    public long getGeneral_profile_compatibility_flags() {
            r2 = this;
            long r0 = r2.general_profile_compatibility_flags
            return r0
    }

    public int getGeneral_profile_idc() {
            r1 = this;
            int r0 = r1.general_profile_idc
            return r0
    }

    public int getGeneral_profile_space() {
            r1 = this;
            int r0 = r1.general_profile_space
            return r0
    }

    public int getLengthSizeMinusOne() {
            r1 = this;
            int r0 = r1.lengthSizeMinusOne
            return r0
    }

    public int getMin_spatial_segmentation_idc() {
            r1 = this;
            int r0 = r1.min_spatial_segmentation_idc
            return r0
    }

    public int getNumTemporalLayers() {
            r1 = this;
            int r0 = r1.numTemporalLayers
            return r0
    }

    public int getParallelismType() {
            r1 = this;
            int r0 = r1.parallelismType
            return r0
    }

    public int getSize() {
            r4 = this;
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r0 = r4.arrays
            java.util.Iterator r0 = r0.iterator()
            r1 = 23
        L8:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto Lf
            return r1
        Lf:
            java.lang.Object r2 = r0.next()
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r2 = (com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array) r2
            int r1 = r1 + 3
            java.util.List<byte[]> r2 = r2.nalUnits
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L24
            goto L8
        L24:
            java.lang.Object r3 = r2.next()
            byte[] r3 = (byte[]) r3
            int r1 = r1 + 2
            int r3 = r3.length
            int r1 = r1 + r3
            goto L1d
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.configurationVersion
            int r0 = r0 * 31
            int r1 = r6.general_profile_space
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.general_tier_flag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.general_profile_idc
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.general_profile_compatibility_flags
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.general_constraint_indicator_flags
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.general_level_idc
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.reserved1
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.min_spatial_segmentation_idc
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.reserved2
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.parallelismType
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.reserved3
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.chromaFormat
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.reserved4
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.bitDepthLumaMinus8
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.reserved5
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.bitDepthChromaMinus8
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.avgFrameRate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.constantFrameRate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.numTemporalLayers
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.temporalIdNested
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.lengthSizeMinusOne
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r1 = r6.arrays
            if (r1 == 0) goto L80
            int r1 = r1.hashCode()
            goto L81
        L80:
            r1 = 0
        L81:
            int r0 = r0 + r1
            return r0
    }

    public boolean isFrame_only_constraint_flag() {
            r1 = this;
            boolean r0 = r1.frame_only_constraint_flag
            return r0
    }

    public boolean isGeneral_tier_flag() {
            r1 = this;
            boolean r0 = r1.general_tier_flag
            return r0
    }

    public boolean isInterlaced_source_flag() {
            r1 = this;
            boolean r0 = r1.interlaced_source_flag
            return r0
    }

    public boolean isNon_packed_constraint_flag() {
            r1 = this;
            boolean r0 = r1.non_packed_constraint_flag
            return r0
    }

    public boolean isProgressive_source_flag() {
            r1 = this;
            boolean r0 = r1.progressive_source_flag
            return r0
    }

    public boolean isTemporalIdNested() {
            r1 = this;
            boolean r0 = r1.temporalIdNested
            return r0
    }

    public void parse(java.nio.ByteBuffer r12) {
            r11 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r11.configurationVersion = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r1 = r0 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> 6
            r11.general_profile_space = r1
            r1 = r0 & 32
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            r11.general_tier_flag = r1
            r0 = r0 & 31
            r11.general_profile_idc = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r12)
            r11.general_profile_compatibility_flags = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt48(r12)
            r11.general_constraint_indicator_flags = r0
            r4 = 44
            long r5 = r0 >> r4
            r7 = 8
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            r11.frame_only_constraint_flag = r5
            long r5 = r0 >> r4
            r9 = 4
            long r5 = r5 & r9
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = 0
        L49:
            r11.non_packed_constraint_flag = r5
            long r5 = r0 >> r4
            r9 = 2
            long r5 = r5 & r9
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = 0
        L57:
            r11.interlaced_source_flag = r5
            long r4 = r0 >> r4
            r9 = 1
            long r4 = r4 & r9
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L64
            r4 = 1
            goto L65
        L64:
            r4 = 0
        L65:
            r11.progressive_source_flag = r4
            r4 = 140737488355327(0x7fffffffffff, double:6.95335580783495E-310)
            long r0 = r0 & r4
            r11.general_constraint_indicator_flags = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r11.general_level_idc = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r12)
            r1 = 61440(0xf000, float:8.6096E-41)
            r1 = r1 & r0
            int r1 = r1 >> 12
            r11.reserved1 = r1
            r0 = r0 & 4095(0xfff, float:5.738E-42)
            r11.min_spatial_segmentation_idc = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r1 = r0 & 252(0xfc, float:3.53E-43)
            int r1 = r1 >> 2
            r11.reserved2 = r1
            r0 = r0 & 3
            r11.parallelismType = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r1 = r0 & 252(0xfc, float:3.53E-43)
            int r1 = r1 >> 2
            r11.reserved3 = r1
            r0 = r0 & 3
            r11.chromaFormat = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r1 = r0 & 248(0xf8, float:3.48E-43)
            int r1 = r1 >> 3
            r11.reserved4 = r1
            r0 = r0 & 7
            r11.bitDepthLumaMinus8 = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r1 = r0 & 248(0xf8, float:3.48E-43)
            int r1 = r1 >> 3
            r11.reserved5 = r1
            r0 = r0 & 7
            r11.bitDepthChromaMinus8 = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r12)
            r11.avgFrameRate = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r1 = r0 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> 6
            r11.constantFrameRate = r1
            r1 = r0 & 56
            int r1 = r1 >> 3
            r11.numTemporalLayers = r1
            r1 = r0 & 4
            if (r1 <= 0) goto Ld9
            r1 = 1
            goto Lda
        Ld9:
            r1 = 0
        Lda:
            r11.temporalIdNested = r1
            r0 = r0 & 3
            r11.lengthSizeMinusOne = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.arrays = r1
            r1 = 0
        Lec:
            if (r1 < r0) goto Lef
            return
        Lef:
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r4 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array
            r4.<init>()
            int r5 = com.coremedia.iso.IsoTypeReader.readUInt8(r12)
            r6 = r5 & 128(0x80, float:1.794E-43)
            if (r6 <= 0) goto Lfe
            r6 = 1
            goto Lff
        Lfe:
            r6 = 0
        Lff:
            r4.array_completeness = r6
            r6 = r5 & 64
            if (r6 <= 0) goto L107
            r6 = 1
            goto L108
        L107:
            r6 = 0
        L108:
            r4.reserved = r6
            r5 = r5 & 63
            r4.nal_unit_type = r5
            int r5 = com.coremedia.iso.IsoTypeReader.readUInt16(r12)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.nalUnits = r6
            r6 = 0
        L11a:
            if (r6 < r5) goto L124
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r5 = r11.arrays
            r5.add(r4)
            int r1 = r1 + 1
            goto Lec
        L124:
            int r7 = com.coremedia.iso.IsoTypeReader.readUInt16(r12)
            byte[] r7 = new byte[r7]
            r12.get(r7)
            java.util.List<byte[]> r8 = r4.nalUnits
            r8.add(r7)
            int r6 = r6 + 1
            goto L11a
    }

    public void setArrays(java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array> r1) {
            r0 = this;
            r0.arrays = r1
            return
    }

    public void setAvgFrameRate(int r1) {
            r0 = this;
            r0.avgFrameRate = r1
            return
    }

    public void setBitDepthChromaMinus8(int r1) {
            r0 = this;
            r0.bitDepthChromaMinus8 = r1
            return
    }

    public void setBitDepthLumaMinus8(int r1) {
            r0 = this;
            r0.bitDepthLumaMinus8 = r1
            return
    }

    public void setChromaFormat(int r1) {
            r0 = this;
            r0.chromaFormat = r1
            return
    }

    public void setConfigurationVersion(int r1) {
            r0 = this;
            r0.configurationVersion = r1
            return
    }

    public void setConstantFrameRate(int r1) {
            r0 = this;
            r0.constantFrameRate = r1
            return
    }

    public void setFrame_only_constraint_flag(boolean r1) {
            r0 = this;
            r0.frame_only_constraint_flag = r1
            return
    }

    public void setGeneral_constraint_indicator_flags(long r1) {
            r0 = this;
            r0.general_constraint_indicator_flags = r1
            return
    }

    public void setGeneral_level_idc(int r1) {
            r0 = this;
            r0.general_level_idc = r1
            return
    }

    public void setGeneral_profile_compatibility_flags(long r1) {
            r0 = this;
            r0.general_profile_compatibility_flags = r1
            return
    }

    public void setGeneral_profile_idc(int r1) {
            r0 = this;
            r0.general_profile_idc = r1
            return
    }

    public void setGeneral_profile_space(int r1) {
            r0 = this;
            r0.general_profile_space = r1
            return
    }

    public void setGeneral_tier_flag(boolean r1) {
            r0 = this;
            r0.general_tier_flag = r1
            return
    }

    public void setInterlaced_source_flag(boolean r1) {
            r0 = this;
            r0.interlaced_source_flag = r1
            return
    }

    public void setLengthSizeMinusOne(int r1) {
            r0 = this;
            r0.lengthSizeMinusOne = r1
            return
    }

    public void setMin_spatial_segmentation_idc(int r1) {
            r0 = this;
            r0.min_spatial_segmentation_idc = r1
            return
    }

    public void setNon_packed_constraint_flag(boolean r1) {
            r0 = this;
            r0.non_packed_constraint_flag = r1
            return
    }

    public void setNumTemporalLayers(int r1) {
            r0 = this;
            r0.numTemporalLayers = r1
            return
    }

    public void setParallelismType(int r1) {
            r0 = this;
            r0.parallelismType = r1
            return
    }

    public void setProgressive_source_flag(boolean r1) {
            r0 = this;
            r0.progressive_source_flag = r1
            return
    }

    public void setTemporalIdNested(boolean r1) {
            r0 = this;
            r0.temporalIdNested = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HEVCDecoderConfigurationRecord{configurationVersion="
            r0.<init>(r1)
            int r1 = r5.configurationVersion
            r0.append(r1)
            java.lang.String r1 = ", general_profile_space="
            r0.append(r1)
            int r1 = r5.general_profile_space
            r0.append(r1)
            java.lang.String r1 = ", general_tier_flag="
            r0.append(r1)
            boolean r1 = r5.general_tier_flag
            r0.append(r1)
            java.lang.String r1 = ", general_profile_idc="
            r0.append(r1)
            int r1 = r5.general_profile_idc
            r0.append(r1)
            java.lang.String r1 = ", general_profile_compatibility_flags="
            r0.append(r1)
            long r1 = r5.general_profile_compatibility_flags
            r0.append(r1)
            java.lang.String r1 = ", general_constraint_indicator_flags="
            r0.append(r1)
            long r1 = r5.general_constraint_indicator_flags
            r0.append(r1)
            java.lang.String r1 = ", general_level_idc="
            r0.append(r1)
            int r1 = r5.general_level_idc
            r0.append(r1)
            int r1 = r5.reserved1
            java.lang.String r2 = ""
            r3 = 15
            if (r1 == r3) goto L61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", reserved1="
            r1.<init>(r3)
            int r3 = r5.reserved1
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L62
        L61:
            r1 = r2
        L62:
            r0.append(r1)
            java.lang.String r1 = ", min_spatial_segmentation_idc="
            r0.append(r1)
            int r1 = r5.min_spatial_segmentation_idc
            r0.append(r1)
            int r1 = r5.reserved2
            r3 = 63
            if (r1 == r3) goto L86
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = ", reserved2="
            r1.<init>(r4)
            int r4 = r5.reserved2
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L87
        L86:
            r1 = r2
        L87:
            r0.append(r1)
            java.lang.String r1 = ", parallelismType="
            r0.append(r1)
            int r1 = r5.parallelismType
            r0.append(r1)
            int r1 = r5.reserved3
            if (r1 == r3) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", reserved3="
            r1.<init>(r3)
            int r3 = r5.reserved3
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto Laa
        La9:
            r1 = r2
        Laa:
            r0.append(r1)
            java.lang.String r1 = ", chromaFormat="
            r0.append(r1)
            int r1 = r5.chromaFormat
            r0.append(r1)
            int r1 = r5.reserved4
            r3 = 31
            if (r1 == r3) goto Lce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = ", reserved4="
            r1.<init>(r4)
            int r4 = r5.reserved4
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto Lcf
        Lce:
            r1 = r2
        Lcf:
            r0.append(r1)
            java.lang.String r1 = ", bitDepthLumaMinus8="
            r0.append(r1)
            int r1 = r5.bitDepthLumaMinus8
            r0.append(r1)
            int r1 = r5.reserved5
            if (r1 == r3) goto Lf0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", reserved5="
            r1.<init>(r2)
            int r2 = r5.reserved5
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        Lf0:
            r0.append(r2)
            java.lang.String r1 = ", bitDepthChromaMinus8="
            r0.append(r1)
            int r1 = r5.bitDepthChromaMinus8
            r0.append(r1)
            java.lang.String r1 = ", avgFrameRate="
            r0.append(r1)
            int r1 = r5.avgFrameRate
            r0.append(r1)
            java.lang.String r1 = ", constantFrameRate="
            r0.append(r1)
            int r1 = r5.constantFrameRate
            r0.append(r1)
            java.lang.String r1 = ", numTemporalLayers="
            r0.append(r1)
            int r1 = r5.numTemporalLayers
            r0.append(r1)
            java.lang.String r1 = ", temporalIdNested="
            r0.append(r1)
            boolean r1 = r5.temporalIdNested
            r0.append(r1)
            java.lang.String r1 = ", lengthSizeMinusOne="
            r0.append(r1)
            int r1 = r5.lengthSizeMinusOne
            r0.append(r1)
            java.lang.String r1 = ", arrays="
            r0.append(r1)
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r1 = r5.arrays
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void write(java.nio.ByteBuffer r6) {
            r5 = this;
            int r0 = r5.configurationVersion
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            int r0 = r5.general_profile_space
            int r0 = r0 << 6
            boolean r1 = r5.general_tier_flag
            r2 = 0
            if (r1 == 0) goto L11
            r1 = 32
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r1 = r5.general_profile_idc
            int r0 = r0 + r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            long r0 = r5.general_profile_compatibility_flags
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            long r0 = r5.general_constraint_indicator_flags
            boolean r3 = r5.frame_only_constraint_flag
            if (r3 == 0) goto L2a
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r0 = r0 | r3
        L2a:
            boolean r3 = r5.non_packed_constraint_flag
            if (r3 == 0) goto L34
            r3 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r0 = r0 | r3
        L34:
            boolean r3 = r5.interlaced_source_flag
            if (r3 == 0) goto L3e
            r3 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            long r0 = r0 | r3
        L3e:
            boolean r3 = r5.progressive_source_flag
            if (r3 == 0) goto L48
            r3 = 17592186044416(0x100000000000, double:8.6916947597938E-311)
            long r0 = r0 | r3
        L48:
            com.coremedia.iso.IsoTypeWriter.writeUInt48(r6, r0)
            int r0 = r5.general_level_idc
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            int r0 = r5.reserved1
            int r0 = r0 << 12
            int r1 = r5.min_spatial_segmentation_idc
            int r0 = r0 + r1
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r0)
            int r0 = r5.reserved2
            int r0 = r0 << 2
            int r1 = r5.parallelismType
            int r0 = r0 + r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            int r0 = r5.reserved3
            int r0 = r0 << 2
            int r1 = r5.chromaFormat
            int r0 = r0 + r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            int r0 = r5.reserved4
            int r0 = r0 << 3
            int r1 = r5.bitDepthLumaMinus8
            int r0 = r0 + r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            int r0 = r5.reserved5
            int r0 = r0 << 3
            int r1 = r5.bitDepthChromaMinus8
            int r0 = r0 + r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            int r0 = r5.avgFrameRate
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r0)
            int r0 = r5.constantFrameRate
            int r0 = r0 << 6
            int r1 = r5.numTemporalLayers
            int r1 = r1 << 3
            int r0 = r0 + r1
            boolean r1 = r5.temporalIdNested
            if (r1 == 0) goto L96
            r1 = 4
            goto L97
        L96:
            r1 = 0
        L97:
            int r0 = r0 + r1
            int r1 = r5.lengthSizeMinusOne
            int r0 = r0 + r1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r0 = r5.arrays
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array> r0 = r5.arrays
            java.util.Iterator r0 = r0.iterator()
        Lad:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Lb4
            return
        Lb4:
            java.lang.Object r1 = r0.next()
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r1 = (com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array) r1
            boolean r3 = r1.array_completeness
            if (r3 == 0) goto Lc1
            r3 = 128(0x80, float:1.794E-43)
            goto Lc2
        Lc1:
            r3 = 0
        Lc2:
            boolean r4 = r1.reserved
            if (r4 == 0) goto Lc9
            r4 = 64
            goto Lca
        Lc9:
            r4 = 0
        Lca:
            int r3 = r3 + r4
            int r4 = r1.nal_unit_type
            int r3 = r3 + r4
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r3)
            java.util.List<byte[]> r3 = r1.nalUnits
            int r3 = r3.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r3)
            java.util.List<byte[]> r1 = r1.nalUnits
            java.util.Iterator r1 = r1.iterator()
        Le0:
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto Le7
            goto Lad
        Le7:
            java.lang.Object r3 = r1.next()
            byte[] r3 = (byte[]) r3
            int r4 = r3.length
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r4)
            r6.put(r3)
            goto Le0
    }
}
