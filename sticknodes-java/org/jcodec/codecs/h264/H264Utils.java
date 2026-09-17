package org.jcodec.codecs.h264;

/* loaded from: classes2.dex */
public class H264Utils {
    private static org.jcodec.codecs.h264.decode.SliceHeaderReader shr;
    private static org.jcodec.codecs.h264.io.write.SliceHeaderWriter shw;

    static {
            org.jcodec.codecs.h264.decode.SliceHeaderReader r0 = new org.jcodec.codecs.h264.decode.SliceHeaderReader
            r0.<init>()
            org.jcodec.codecs.h264.H264Utils.shr = r0
            org.jcodec.codecs.h264.io.write.SliceHeaderWriter r0 = new org.jcodec.codecs.h264.io.write.SliceHeaderWriter
            r0.<init>()
            org.jcodec.codecs.h264.H264Utils.shw = r0
            return
    }

    public static org.jcodec.containers.mp4.boxes.SampleEntry createMOVSampleEntryFromAvcC(org.jcodec.codecs.h264.mp4.AvcCBox r7) {
            java.util.List r0 = r7.getSpsList()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = r0.duplicate()
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = org.jcodec.codecs.h264.io.model.SeqParameterSet.read(r0)
            int r1 = r0.pic_width_in_mbs_minus1
            r2 = 1
            int r1 = r1 + r2
            int r1 = r1 << 4
            int r3 = getPicHeightInMbs(r0)
            int r3 = r3 << 4
            boolean r4 = r0.frame_cropping_flag
            if (r4 == 0) goto L30
            int r5 = r0.frame_crop_right_offset
            int r6 = r0.frame_crop_left_offset
            int r5 = r5 + r6
            org.jcodec.common.model.ColorSpace r6 = r0.chroma_format_idc
            int[] r6 = r6.compWidth
            r6 = r6[r2]
            int r5 = r5 << r6
            int r1 = r1 - r5
        L30:
            if (r4 == 0) goto L40
            int r4 = r0.frame_crop_bottom_offset
            int r5 = r0.frame_crop_top_offset
            int r4 = r4 + r5
            org.jcodec.common.model.ColorSpace r0 = r0.chroma_format_idc
            int[] r0 = r0.compHeight
            r0 = r0[r2]
            int r0 = r4 << r0
            int r3 = r3 - r0
        L40:
            org.jcodec.common.model.Size r0 = new org.jcodec.common.model.Size
            r0.<init>(r1, r3)
            java.lang.String r1 = "avc1"
            java.lang.String r2 = "JCodec"
            org.jcodec.containers.mp4.boxes.VideoSampleEntry r0 = org.jcodec.containers.mp4.muxer.MP4Muxer.videoSampleEntry(r1, r0, r2)
            r0.add(r7)
            return r0
    }

    public static org.jcodec.containers.mp4.boxes.SampleEntry createMOVSampleEntryFromBuffer(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, int r5) {
            r0 = 1
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r0]
            r2 = 0
            r1[r2] = r3
            java.util.List r3 = java.util.Arrays.asList(r1)
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]
            r0[r2] = r4
            java.util.List r4 = java.util.Arrays.asList(r0)
            org.jcodec.containers.mp4.boxes.SampleEntry r3 = createMOVSampleEntryFromSpsPpsList(r3, r4, r5)
            return r3
    }

    public static org.jcodec.containers.mp4.boxes.SampleEntry createMOVSampleEntryFromSpsPpsList(java.util.List<java.nio.ByteBuffer> r7, java.util.List<java.nio.ByteBuffer> r8, int r9) {
            r0 = 0
            java.lang.Object r0 = r7.get(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = org.jcodec.common.io.NIOUtils.duplicate(r0)
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = readSPS(r0)
            int r1 = r0.profile_idc
            int r3 = r0.level_idc
            r2 = 0
            r4 = r9
            r5 = r7
            r6 = r8
            org.jcodec.codecs.h264.mp4.AvcCBox r7 = org.jcodec.codecs.h264.mp4.AvcCBox.createAvcCBox(r1, r2, r3, r4, r5, r6)
            org.jcodec.containers.mp4.boxes.SampleEntry r7 = createMOVSampleEntryFromAvcC(r7)
            return r7
    }

    public static void encodeMOVPacket(java.nio.ByteBuffer r4) {
            java.nio.ByteBuffer r0 = r4.duplicate()
            java.nio.ByteBuffer r4 = r4.duplicate()
            int r1 = r4.position()
        Lc:
            java.nio.ByteBuffer r2 = nextNALUnit(r0)
            if (r2 != 0) goto L13
            return
        L13:
            java.nio.Buffer r3 = r4.position(r1)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r2.remaining()
            r4.putInt(r3)
            int r2 = r2.remaining()
            int r2 = r2 + 4
            int r1 = r1 + r2
            goto Lc
    }

    public static final void escapeNAL(java.nio.ByteBuffer r4, java.nio.ByteBuffer r5) {
            byte r0 = r4.get()
            byte r1 = r4.get()
            r5.put(r0)
            r5.put(r1)
        Le:
            boolean r2 = r4.hasRemaining()
            if (r2 == 0) goto L2c
            byte r2 = r4.get()
            r3 = 3
            if (r0 != 0) goto L26
            if (r1 != 0) goto L26
            r0 = r2 & 255(0xff, float:3.57E-43)
            if (r0 > r3) goto L26
            r5.put(r3)
            r0 = 3
            goto L27
        L26:
            r0 = r1
        L27:
            r5.put(r2)
            r1 = r2
            goto Le
        L2c:
            return
    }

    public static int getPicHeightInMbs(org.jcodec.codecs.h264.io.model.SeqParameterSet r1) {
            int r0 = r1.pic_height_in_map_units_minus1
            int r0 = r0 + 1
            boolean r1 = r1.frame_mbs_only_flag
            r1 = r1 ^ 1
            int r1 = r0 << r1
            return r1
    }

    public static int golomb2Signed(int r2) {
            r0 = r2 & 1
            int r1 = r0 << 1
            int r1 = r1 + (-1)
            int r2 = r2 >> 1
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    public static final java.nio.ByteBuffer gotoNALUnit(java.nio.ByteBuffer r5) {
            boolean r0 = r5.hasRemaining()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            int r0 = r5.position()
            java.nio.ByteBuffer r1 = r5.slice()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r2)
            r2 = -1
        L16:
            boolean r3 = r5.hasRemaining()
            if (r3 == 0) goto L47
            int r2 = r2 << 8
            byte r3 = r5.get()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r2
            r4 = 1
            if (r3 != r4) goto L16
            int r3 = r5.position()
            if (r2 != r4) goto L34
            r2 = 4
            goto L35
        L34:
            r2 = 3
        L35:
            int r3 = r3 - r2
            java.nio.Buffer r2 = r5.position(r3)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r5 = r5.position()
            int r5 = r5 - r0
            java.nio.Buffer r5 = r1.limit(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
        L47:
            return r1
    }

    public static java.nio.ByteBuffer nextNALUnit(java.nio.ByteBuffer r0) {
            skipToNALUnit(r0)
            java.nio.ByteBuffer r0 = gotoNALUnit(r0)
            return r0
    }

    public static org.jcodec.codecs.h264.io.model.SeqParameterSet readSPS(java.nio.ByteBuffer r0) {
            java.nio.ByteBuffer r0 = org.jcodec.common.io.NIOUtils.duplicate(r0)
            unescapeNAL(r0)
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = org.jcodec.codecs.h264.io.model.SeqParameterSet.read(r0)
            return r0
    }

    public static final void skipToNALUnit(java.nio.ByteBuffer r3) {
            boolean r0 = r3.hasRemaining()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = -1
        L8:
            boolean r1 = r3.hasRemaining()
            if (r1 == 0) goto L28
            int r0 = r0 << 8
            byte r1 = r3.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r2 = 1
            if (r1 != r2) goto L8
            int r0 = r3.position()
            java.nio.Buffer r3 = r3.position(r0)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
        L28:
            return
    }

    public static final void unescapeNAL(java.nio.ByteBuffer r5) {
            int r0 = r5.remaining()
            r1 = 2
            if (r0 >= r1) goto L8
            return
        L8:
            java.nio.ByteBuffer r0 = r5.duplicate()
            java.nio.ByteBuffer r1 = r5.duplicate()
            byte r2 = r0.get()
            r1.put(r2)
            byte r3 = r0.get()
            r1.put(r3)
        L1e:
            boolean r4 = r0.hasRemaining()
            if (r4 == 0) goto L35
            byte r4 = r0.get()
            if (r2 != 0) goto L2f
            if (r3 != 0) goto L2f
            r2 = 3
            if (r4 == r2) goto L32
        L2f:
            r1.put(r4)
        L32:
            r2 = r3
            r3 = r4
            goto L1e
        L35:
            int r0 = r1.position()
            java.nio.Buffer r5 = r5.limit(r0)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            return
    }

    public static void wipePSinplace(java.nio.ByteBuffer r4, java.util.Collection<java.nio.ByteBuffer> r5, java.util.Collection<java.nio.ByteBuffer> r6) {
            java.nio.ByteBuffer r0 = r4.duplicate()
        L4:
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L4f
            java.nio.ByteBuffer r1 = nextNALUnit(r0)
            if (r1 != 0) goto L11
            goto L4f
        L11:
            org.jcodec.codecs.h264.io.model.NALUnit r2 = org.jcodec.codecs.h264.io.model.NALUnit.read(r1)
            org.jcodec.codecs.h264.io.model.NALUnitType r2 = r2.type
            org.jcodec.codecs.h264.io.model.NALUnitType r3 = org.jcodec.codecs.h264.io.model.NALUnitType.PPS
            if (r2 != r3) goto L2f
            if (r6 == 0) goto L24
            java.nio.ByteBuffer r1 = org.jcodec.common.io.NIOUtils.duplicate(r1)
            r6.add(r1)
        L24:
            int r1 = r0.position()
            java.nio.Buffer r1 = r4.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            goto L4
        L2f:
            org.jcodec.codecs.h264.io.model.NALUnitType r3 = org.jcodec.codecs.h264.io.model.NALUnitType.SPS
            if (r2 != r3) goto L47
            if (r5 == 0) goto L3c
            java.nio.ByteBuffer r1 = org.jcodec.common.io.NIOUtils.duplicate(r1)
            r5.add(r1)
        L3c:
            int r1 = r0.position()
            java.nio.Buffer r1 = r4.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            goto L4
        L47:
            org.jcodec.codecs.h264.io.model.NALUnitType r1 = org.jcodec.codecs.h264.io.model.NALUnitType.IDR_SLICE
            if (r2 == r1) goto L4f
            org.jcodec.codecs.h264.io.model.NALUnitType r1 = org.jcodec.codecs.h264.io.model.NALUnitType.NON_IDR_SLICE
            if (r2 != r1) goto L4
        L4f:
            return
    }
}
