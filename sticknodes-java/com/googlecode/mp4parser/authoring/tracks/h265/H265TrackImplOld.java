package com.googlecode.mp4parser.authoring.tracks.h265;

/* loaded from: classes2.dex */
public class H265TrackImplOld {
    public static final int AUD_NUT = 35;
    private static final int BLA_N_LP = 18;
    private static final int BLA_W_LP = 16;
    private static final int BLA_W_RADL = 17;
    private static final long BUFFER = 1048576;
    private static final int CRA_NUT = 21;
    private static final int IDR_N_LP = 20;
    private static final int IDR_W_RADL = 19;
    public static final int PPS_NUT = 34;
    public static final int PREFIX_SEI_NUT = 39;
    private static final int RADL_N = 6;
    private static final int RADL_R = 7;
    private static final int RASL_N = 8;
    private static final int RASL_R = 9;
    public static final int RSV_NVCL41 = 41;
    public static final int RSV_NVCL42 = 42;
    public static final int RSV_NVCL43 = 43;
    public static final int RSV_NVCL44 = 44;
    public static final int SPS_NUT = 33;
    private static final int STSA_N = 4;
    private static final int STSA_R = 5;
    private static final int TRAIL_N = 0;
    private static final int TRAIL_R = 1;
    private static final int TSA_N = 2;
    private static final int TSA_R = 3;
    public static final int UNSPEC48 = 48;
    public static final int UNSPEC49 = 49;
    public static final int UNSPEC50 = 50;
    public static final int UNSPEC51 = 51;
    public static final int UNSPEC52 = 52;
    public static final int UNSPEC53 = 53;
    public static final int UNSPEC54 = 54;
    public static final int UNSPEC55 = 55;
    public static final int VPS_NUT = 32;
    java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> pictureParamterSets;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> sequenceParamterSets;
    java.util.List<java.lang.Long> syncSamples;
    java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> videoParamterSets;

    class LookAhead {
        java.nio.ByteBuffer buffer;
        long bufferStartPos;
        com.googlecode.mp4parser.DataSource dataSource;
        int inBufferPos;
        long start;
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld this$0;

        LookAhead(com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld r3, com.googlecode.mp4parser.DataSource r4) throws java.io.IOException {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r0 = 0
                r2.bufferStartPos = r0
                r3 = 0
                r2.inBufferPos = r3
                r2.dataSource = r4
                r2.fillBuffer()
                return
        }

        void discardByte() {
                r1 = this;
                int r0 = r1.inBufferPos
                int r0 = r0 + 1
                r1.inBufferPos = r0
                return
        }

        void discardNext3AndMarkStart() {
                r5 = this;
                int r0 = r5.inBufferPos
                int r0 = r0 + 3
                r5.inBufferPos = r0
                long r1 = r5.bufferStartPos
                long r3 = (long) r0
                long r1 = r1 + r3
                r5.start = r1
                return
        }

        public void fillBuffer() throws java.io.IOException {
                r7 = this;
                com.googlecode.mp4parser.DataSource r0 = r7.dataSource
                long r1 = r7.bufferStartPos
                long r3 = r0.size()
                long r5 = r7.bufferStartPos
                long r3 = r3 - r5
                r5 = 1048576(0x100000, double:5.180654E-318)
                long r3 = java.lang.Math.min(r3, r5)
                java.nio.ByteBuffer r0 = r0.map(r1, r3)
                r7.buffer = r0
                return
        }

        public java.nio.ByteBuffer getNal() {
                r7 = this;
                long r0 = r7.start
                long r2 = r7.bufferStartPos
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L23
                java.nio.ByteBuffer r4 = r7.buffer
                long r0 = r0 - r2
                int r1 = (int) r0
                r4.position(r1)
                java.nio.ByteBuffer r0 = r7.buffer
                java.nio.ByteBuffer r0 = r0.slice()
                int r1 = r7.inBufferPos
                long r1 = (long) r1
                long r3 = r7.start
                long r5 = r7.bufferStartPos
                long r3 = r3 - r5
                long r1 = r1 - r3
                int r2 = (int) r1
                r0.limit(r2)
                return r0
            L23:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "damn! NAL exceeds buffer"
                r0.<init>(r1)
                throw r0
        }

        boolean nextThreeEquals000or001orEof() throws java.io.IOException {
                r7 = this;
                java.nio.ByteBuffer r0 = r7.buffer
                int r0 = r0.limit()
                int r1 = r7.inBufferPos
                int r0 = r0 - r1
                r2 = 0
                r3 = 1
                r4 = 3
                if (r0 < r4) goto L3b
                java.nio.ByteBuffer r0 = r7.buffer
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L3a
                java.nio.ByteBuffer r0 = r7.buffer
                int r1 = r7.inBufferPos
                int r1 = r1 + r3
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L3a
                java.nio.ByteBuffer r0 = r7.buffer
                int r1 = r7.inBufferPos
                int r1 = r1 + 2
                byte r0 = r0.get(r1)
                if (r0 == 0) goto L39
                java.nio.ByteBuffer r0 = r7.buffer
                int r1 = r7.inBufferPos
                int r1 = r1 + 2
                byte r0 = r0.get(r1)
                if (r0 != r3) goto L3a
            L39:
                return r3
            L3a:
                return r2
            L3b:
                long r4 = r7.bufferStartPos
                long r0 = (long) r1
                long r4 = r4 + r0
                r0 = 3
                long r4 = r4 + r0
                com.googlecode.mp4parser.DataSource r0 = r7.dataSource
                long r0 = r0.size()
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L5e
                long r0 = r7.bufferStartPos
                int r4 = r7.inBufferPos
                long r4 = (long) r4
                long r0 = r0 + r4
                com.googlecode.mp4parser.DataSource r4 = r7.dataSource
                long r4 = r4.size()
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto L5d
                return r3
            L5d:
                return r2
            L5e:
                long r0 = r7.start
                r7.bufferStartPos = r0
                r7.inBufferPos = r2
                r7.fillBuffer()
                boolean r0 = r7.nextThreeEquals000or001orEof()
                return r0
        }

        boolean nextThreeEquals001() throws java.io.IOException {
                r5 = this;
                java.nio.ByteBuffer r0 = r5.buffer
                int r0 = r0.limit()
                int r1 = r5.inBufferPos
                int r0 = r0 - r1
                r2 = 3
                if (r0 < r2) goto L2f
                java.nio.ByteBuffer r0 = r5.buffer
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L2d
                java.nio.ByteBuffer r0 = r5.buffer
                int r1 = r5.inBufferPos
                r2 = 1
                int r1 = r1 + r2
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L2d
                java.nio.ByteBuffer r0 = r5.buffer
                int r1 = r5.inBufferPos
                int r1 = r1 + 2
                byte r0 = r0.get(r1)
                if (r0 != r2) goto L2d
                return r2
            L2d:
                r0 = 0
                return r0
            L2f:
                long r2 = r5.bufferStartPos
                long r0 = (long) r1
                long r2 = r2 + r0
                com.googlecode.mp4parser.DataSource r0 = r5.dataSource
                long r0 = r0.size()
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L43
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L43:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "buffer repositioning require"
                r0.<init>(r1)
                throw r0
        }
    }

    public static class NalUnitHeader {
        int forbiddenZeroFlag;
        int nalUnitType;
        int nuhLayerId;
        int nuhTemporalIdPlusOne;

        public NalUnitHeader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public enum PARSE_STATE extends java.lang.Enum<com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE> {
        public static final com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE AUD_SEI_SLICE = null;
        private static final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE[] ENUM$VALUES = null;
        public static final com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE SEI_SLICE = null;
        public static final com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE SLICE_OES_EOB = null;

        static {
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE r0 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE
                java.lang.String r1 = "AUD_SEI_SLICE"
                r2 = 0
                r0.<init>(r1, r2)
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE.AUD_SEI_SLICE = r0
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE r1 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE
                java.lang.String r3 = "SEI_SLICE"
                r4 = 1
                r1.<init>(r3, r4)
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE.SEI_SLICE = r1
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE r3 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE
                java.lang.String r5 = "SLICE_OES_EOB"
                r6 = 2
                r3.<init>(r5, r6)
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE.SLICE_OES_EOB = r3
                r5 = 3
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE[] r5 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE.ENUM$VALUES = r5
                return
        }

        PARSE_STATE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE valueOf(java.lang.String r1) {
                java.lang.Class<com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE> r0 = com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE r1 = (com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE) r1
                return r1
        }

        public static com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE[] values() {
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE[] r0 = com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE.ENUM$VALUES
                int r1 = r0.length
                com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$PARSE_STATE[] r2 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.PARSE_STATE[r1]
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                return r2
        }
    }

    public H265TrackImplOld(com.googlecode.mp4parser.DataSource r17) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r16.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.videoParamterSets = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.sequenceParamterSets = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.pictureParamterSets = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.syncSamples = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.samples = r1
            com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$LookAhead r1 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$LookAhead
            r2 = r17
            r1.<init>(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            r5 = 0
            r6 = r3
            r8 = 0
        L39:
            java.nio.ByteBuffer r9 = r0.findNextNal(r1)
            if (r9 != 0) goto L56
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = ""
            r1.println(r2)
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord r1 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord
            r1.<init>()
            java.util.List r2 = r16.getArrays()
            r1.setArrays(r2)
            r1.setAvgFrameRate(r5)
            return
        L56:
            com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$NalUnitHeader r10 = r0.getNalUnitHeader(r9)
            int r11 = r10.nalUnitType
            switch(r11) {
                case 32: goto L74;
                case 33: goto L6a;
                case 34: goto L60;
                default: goto L5f;
            }
        L5f:
            goto L7d
        L60:
            java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> r11 = r0.pictureParamterSets
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            r11.put(r12, r9)
            goto L7d
        L6a:
            java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> r11 = r0.sequenceParamterSets
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            r11.put(r12, r9)
            goto L7d
        L74:
            java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> r11 = r0.videoParamterSets
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            r11.put(r12, r9)
        L7d:
            int r10 = r10.nalUnitType
            r11 = 32
            if (r10 >= r11) goto L84
            r8 = r10
        L84:
            boolean r10 = r0.isFirstOfAU(r10, r9, r2)
            if (r10 == 0) goto Lf6
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto Lf6
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.String r11 = "##########################"
            r10.println(r11)
            java.util.Iterator r10 = r2.iterator()
        L9b:
            boolean r11 = r10.hasNext()
            if (r11 != 0) goto Lb6
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.String r11 = "                          ##########################"
            r10.println(r11)
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r10 = r0.samples
            com.googlecode.mp4parser.authoring.Sample r11 = r0.createSample(r2)
            r10.add(r11)
            r2.clear()
            long r6 = r6 + r3
            goto Lf6
        Lb6:
            java.lang.Object r11 = r10.next()
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
            com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$NalUnitHeader r12 = r0.getNalUnitHeader(r11)
            java.io.PrintStream r13 = java.lang.System.err
            r14 = 4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r15 = r12.nalUnitType
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r5] = r15
            r15 = 1
            int r3 = r12.nuhLayerId
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14[r15] = r3
            r3 = 2
            int r4 = r12.nuhTemporalIdPlusOne
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14[r3] = r4
            r3 = 3
            int r4 = r11.limit()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14[r3] = r4
            java.lang.String r3 = "type: %3d - layer: %3d - tempId: %3d - size: %3d"
            java.lang.String r3 = java.lang.String.format(r3, r14)
            r13.println(r3)
            r3 = 1
            goto L9b
        Lf6:
            r2.add(r9)
            r3 = 16
            if (r8 < r3) goto L10a
            r3 = 21
            if (r8 > r3) goto L10a
            java.util.List<java.lang.Long> r3 = r0.syncSamples
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3.add(r4)
        L10a:
            r3 = 1
            goto L39
    }

    private java.nio.ByteBuffer findNextNal(com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.LookAhead r2) throws java.io.IOException {
            r1 = this;
        L0:
            boolean r0 = r2.nextThreeEquals001()     // Catch: java.io.EOFException -> L1c
            if (r0 == 0) goto L18
            r2.discardNext3AndMarkStart()     // Catch: java.io.EOFException -> L1c
        L9:
            boolean r0 = r2.nextThreeEquals000or001orEof()     // Catch: java.io.EOFException -> L1c
            if (r0 == 0) goto L14
            java.nio.ByteBuffer r2 = r2.getNal()     // Catch: java.io.EOFException -> L1c
            return r2
        L14:
            r2.discardByte()     // Catch: java.io.EOFException -> L1c
            goto L9
        L18:
            r2.discardByte()     // Catch: java.io.EOFException -> L1c
            goto L0
        L1c:
            r2 = 0
            return r2
    }

    private java.util.List<com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array> getArrays() {
            r8 = this;
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r0 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array
            r0.<init>()
            r1 = 1
            r0.array_completeness = r1
            r2 = 32
            r0.nal_unit_type = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.nalUnits = r2
            java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> r2 = r8.videoParamterSets
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 != 0) goto La5
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r3 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array
            r3.<init>()
            r3.array_completeness = r1
            r5 = 33
            r3.nal_unit_type = r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.nalUnits = r2
            java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> r2 = r8.sequenceParamterSets
            java.util.Collection r2 = r2.values()
            java.util.Iterator r6 = r2.iterator()
        L40:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L8d
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array r2 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array
            r2.<init>()
            r2.array_completeness = r1
            r2.nal_unit_type = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.nalUnits = r5
            java.util.LinkedHashMap<java.lang.Long, java.nio.ByteBuffer> r5 = r8.pictureParamterSets
            java.util.Collection r5 = r5.values()
            java.util.Iterator r7 = r5.iterator()
        L60:
            boolean r5 = r7.hasNext()
            if (r5 != 0) goto L75
            r5 = 3
            com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord$Array[] r5 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array[r5]
            r5[r4] = r0
            r5[r1] = r3
            r0 = 2
            r5[r0] = r2
            java.util.List r0 = java.util.Arrays.asList(r5)
            return r0
        L75:
            java.lang.Object r5 = r7.next()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r6 = r5.limit()
            byte[] r6 = new byte[r6]
            r5.position(r4)
            r5.get(r6)
            java.util.List<byte[]> r5 = r2.nalUnits
            r5.add(r6)
            goto L60
        L8d:
            java.lang.Object r2 = r6.next()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r7 = r2.limit()
            byte[] r7 = new byte[r7]
            r2.position(r4)
            r2.get(r7)
            java.util.List<byte[]> r2 = r3.nalUnits
            r2.add(r7)
            goto L40
        La5:
            java.lang.Object r3 = r2.next()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r5 = r3.limit()
            byte[] r5 = new byte[r5]
            r3.position(r4)
            r3.get(r5)
            java.util.List<byte[]> r3 = r0.nalUnits
            r3.add(r5)
            goto L1d
    }

    private void hrd_parameters(boolean r12, int r13, com.googlecode.mp4parser.h264.read.CAVLCReader r14) throws java.io.IOException {
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L54
            java.lang.String r12 = "nal_hrd_parameters_present_flag"
            boolean r12 = r14.readBool(r12)
            java.lang.String r1 = "vcl_hrd_parameters_present_flag"
            boolean r1 = r14.readBool(r1)
            if (r12 != 0) goto L13
            if (r1 == 0) goto L56
        L13:
            java.lang.String r2 = "sub_pic_hrd_params_present_flag"
            boolean r2 = r14.readBool(r2)
            r3 = 5
            if (r2 == 0) goto L32
            r4 = 8
            java.lang.String r5 = "tick_divisor_minus2"
            r14.readU(r4, r5)
            java.lang.String r4 = "du_cpb_removal_delay_increment_length_minus1"
            r14.readU(r3, r4)
            java.lang.String r4 = "sub_pic_cpb_params_in_pic_timing_sei_flag"
            r14.readBool(r4)
            java.lang.String r4 = "dpb_output_delay_du_length_minus1"
            r14.readU(r3, r4)
        L32:
            r4 = 4
            java.lang.String r5 = "bit_rate_scale"
            r14.readU(r4, r5)
            java.lang.String r5 = "cpb_size_scale"
            r14.readU(r4, r5)
            if (r2 == 0) goto L44
            java.lang.String r5 = "cpb_size_du_scale"
            r14.readU(r4, r5)
        L44:
            java.lang.String r4 = "initial_cpb_removal_delay_length_minus1"
            r14.readU(r3, r4)
            java.lang.String r4 = "au_cpb_removal_delay_length_minus1"
            r14.readU(r3, r4)
            java.lang.String r4 = "dpb_output_delay_length_minus1"
            r14.readU(r3, r4)
            goto L57
        L54:
            r12 = 0
            r1 = 0
        L56:
            r2 = 0
        L57:
            boolean[] r3 = new boolean[r13]
            boolean[] r4 = new boolean[r13]
            boolean[] r5 = new boolean[r13]
            int[] r6 = new int[r13]
            int[] r7 = new int[r13]
        L61:
            if (r0 <= r13) goto L64
            return
        L64:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "fixed_pic_rate_general_flag["
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r9 = "]"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r14.readBool(r8)
            r3[r0] = r8
            boolean r8 = r3[r0]
            if (r8 != 0) goto L98
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "fixed_pic_rate_within_cvs_flag["
            r8.<init>(r10)
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r14.readBool(r8)
            r4[r0] = r8
        L98:
            boolean r8 = r4[r0]
            if (r8 == 0) goto Lb4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "elemental_duration_in_tc_minus1["
            r8.<init>(r10)
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r8 = r14.readUE(r8)
            r7[r0] = r8
            goto Lcb
        Lb4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "low_delay_hrd_flag["
            r8.<init>(r10)
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r14.readBool(r8)
            r5[r0] = r8
        Lcb:
            boolean r8 = r5[r0]
            if (r8 != 0) goto Le6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "cpb_cnt_minus1["
            r8.<init>(r10)
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r8 = r14.readUE(r8)
            r6[r0] = r8
        Le6:
            if (r12 == 0) goto Led
            r8 = r6[r0]
            r11.sub_layer_hrd_parameters(r0, r8, r2, r14)
        Led:
            if (r1 == 0) goto Lf4
            r8 = r6[r0]
            r11.sub_layer_hrd_parameters(r0, r8, r2, r14)
        Lf4:
            int r0 = r0 + 1
            goto L61
    }

    public static void main(java.lang.String[] r2) throws java.io.IOException {
            com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld r2 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld
            com.googlecode.mp4parser.FileDataSourceImpl r0 = new com.googlecode.mp4parser.FileDataSourceImpl
            java.lang.String r1 = "c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    protected com.googlecode.mp4parser.authoring.Sample createSample(java.util.List<java.nio.ByteBuffer> r7) {
            r6 = this;
            int r0 = r7.size()
            r1 = 4
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.util.Iterator r3 = r7.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L43
            int r2 = r7.size()
            int r2 = r2 * 2
            java.nio.ByteBuffer[] r4 = new java.nio.ByteBuffer[r2]
            r2 = 0
        L20:
            int r3 = r7.size()
            if (r2 < r3) goto L2c
            com.googlecode.mp4parser.authoring.SampleImpl r7 = new com.googlecode.mp4parser.authoring.SampleImpl
            r7.<init>(r4)
            return r7
        L2c:
            int r3 = r2 * 2
            int r5 = r2 * 4
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r0, r5, r1)
            r4[r3] = r5
            int r3 = r3 + 1
            java.lang.Object r5 = r7.get(r2)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            r4[r3] = r5
            int r2 = r2 + 1
            goto L20
        L43:
            java.lang.Object r4 = r3.next()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.remaining()
            r2.putInt(r4)
            goto L11
    }

    public int getFrameRate(java.nio.ByteBuffer r15) throws java.io.IOException {
            r14 = this;
            com.googlecode.mp4parser.h264.read.CAVLCReader r0 = new com.googlecode.mp4parser.h264.read.CAVLCReader
            com.googlecode.mp4parser.util.ByteBufferByteChannel r1 = new com.googlecode.mp4parser.util.ByteBufferByteChannel
            r2 = 0
            java.nio.Buffer r15 = r15.position(r2)
            java.nio.ByteBuffer r15 = (java.nio.ByteBuffer) r15
            r1.<init>(r15)
            java.io.InputStream r15 = java.nio.channels.Channels.newInputStream(r1)
            r0.<init>(r15)
            r15 = 4
            java.lang.String r1 = "vps_parameter_set_id"
            r0.readU(r15, r1)
            r15 = 2
            java.lang.String r1 = "vps_reserved_three_2bits"
            r0.readU(r15, r1)
            r1 = 6
            java.lang.String r3 = "vps_max_layers_minus1"
            r0.readU(r1, r3)
            r3 = 3
            java.lang.String r4 = "vps_max_sub_layers_minus1"
            int r3 = r0.readU(r3, r4)
            java.lang.String r4 = "vps_temporal_id_nesting_flag"
            r0.readBool(r4)
            r4 = 16
            java.lang.String r5 = "vps_reserved_0xffff_16bits"
            r0.readU(r4, r5)
            r14.profile_tier_level(r3, r0)
            java.lang.String r4 = "vps_sub_layer_ordering_info_present_flag"
            boolean r4 = r0.readBool(r4)
            if (r4 == 0) goto L47
            r5 = 0
            goto L48
        L47:
            r5 = r3
        L48:
            int[] r5 = new int[r5]
            if (r4 == 0) goto L4e
            r6 = 0
            goto L4f
        L4e:
            r6 = r3
        L4f:
            int[] r6 = new int[r6]
            if (r4 == 0) goto L55
            r7 = 0
            goto L56
        L55:
            r7 = r3
        L56:
            int[] r7 = new int[r7]
            if (r4 == 0) goto L5c
            r4 = 0
            goto L5d
        L5c:
            r4 = r3
        L5d:
            java.lang.String r8 = "]"
            if (r4 <= r3) goto L12e
            java.lang.String r4 = "vps_max_layer_id"
            int r9 = r0.readU(r1, r4)
            java.lang.String r1 = "vps_num_layer_sets_minus1"
            int r10 = r0.readUE(r1)
            int[] r15 = new int[r15]
            r11 = 1
            r15[r11] = r9
            r15[r2] = r10
            java.lang.Class<boolean> r1 = boolean.class
            java.lang.Object r15 = java.lang.reflect.Array.newInstance(r1, r15)
            r12 = r15
            boolean[][] r12 = (boolean[][]) r12
            r13 = 1
        L7e:
            if (r13 <= r10) goto L103
            java.lang.String r15 = "vps_timing_info_present_flag"
            boolean r15 = r0.readBool(r15)
            if (r15 == 0) goto Lea
            r15 = 32
            java.lang.String r1 = "vps_num_units_in_tick"
            r0.readU(r15, r1)
            java.lang.String r1 = "vps_time_scale"
            r0.readU(r15, r1)
            java.lang.String r15 = "vps_poc_proportional_to_timing_flag"
            boolean r15 = r0.readBool(r15)
            if (r15 == 0) goto La1
            java.lang.String r15 = "vps_num_ticks_poc_diff_one_minus1"
            r0.readUE(r15)
        La1:
            java.lang.String r15 = "vps_num_hrd_parameters"
            int r15 = r0.readUE(r15)
            int[] r1 = new int[r15]
            boolean[] r4 = new boolean[r15]
            r5 = 0
        Lac:
            if (r5 < r15) goto Laf
            goto Lea
        Laf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "hrd_layer_set_idx["
            r6.<init>(r7)
            r6.append(r5)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            int r6 = r0.readUE(r6)
            r1[r5] = r6
            if (r5 <= 0) goto Le0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "cprms_present_flag["
            r6.<init>(r7)
            r6.append(r5)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r6 = r0.readBool(r6)
            r4[r5] = r6
            goto Le2
        Le0:
            r4[r2] = r11
        Le2:
            boolean r6 = r4[r5]
            r14.hrd_parameters(r6, r3, r0)
            int r5 = r5 + 1
            goto Lac
        Lea:
            java.lang.String r15 = "vps_extension_flag"
            boolean r15 = r0.readBool(r15)
            if (r15 == 0) goto Lff
        Lf2:
            boolean r15 = r0.moreRBSPData()
            if (r15 != 0) goto Lf9
            goto Lff
        Lf9:
            java.lang.String r15 = "vps_extension_data_flag"
            r0.readBool(r15)
            goto Lf2
        Lff:
            r0.readTrailingBits()
            return r2
        L103:
            r15 = 0
        L104:
            if (r15 <= r9) goto L10a
            int r13 = r13 + 1
            goto L7e
        L10a:
            r1 = r12[r13]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "layer_id_included_flag["
            r4.<init>(r5)
            r4.append(r13)
            java.lang.String r5 = "]["
            r4.append(r5)
            r4.append(r15)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.readBool(r4)
            r1[r15] = r4
            int r15 = r15 + 1
            goto L104
        L12e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "vps_max_dec_pic_buffering_minus1["
            r9.<init>(r10)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            int r9 = r0.readUE(r9)
            r5[r4] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r10)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            int r9 = r0.readUE(r9)
            r6[r4] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r10)
            r9.append(r4)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            int r8 = r0.readUE(r8)
            r7[r4] = r8
            int r4 = r4 + 1
            goto L5d
    }

    public com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld.NalUnitHeader getNalUnitHeader(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 0
            r3.position(r0)
            int r3 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$NalUnitHeader r0 = new com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$NalUnitHeader
            r0.<init>()
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r3
            int r1 = r1 >> 15
            r0.forbiddenZeroFlag = r1
            r1 = r3 & 32256(0x7e00, float:4.52E-41)
            int r1 = r1 >> 9
            r0.nalUnitType = r1
            r1 = r3 & 504(0x1f8, float:7.06E-43)
            int r1 = r1 >> 3
            r0.nuhLayerId = r1
            r3 = r3 & 7
            r0.nuhTemporalIdPlusOne = r3
            return r0
    }

    boolean isFirstOfAU(int r4, java.nio.ByteBuffer r5, java.util.List<java.nio.ByteBuffer> r6) {
            r3 = this;
            boolean r0 = r6.isEmpty()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r6.size()
            int r0 = r0 - r1
            java.lang.Object r6 = r6.get(r0)
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImplOld$NalUnitHeader r6 = r3.getNalUnitHeader(r6)
            int r6 = r6.nalUnitType
            r0 = 31
            r2 = 0
            if (r6 > r0) goto L20
            r6 = 1
            goto L21
        L20:
            r6 = 0
        L21:
            switch(r4) {
                case 32: goto L25;
                case 33: goto L25;
                case 34: goto L25;
                case 35: goto L25;
                case 36: goto L24;
                case 37: goto L24;
                case 38: goto L24;
                case 39: goto L25;
                case 40: goto L24;
                case 41: goto L25;
                case 42: goto L25;
                case 43: goto L25;
                case 44: goto L25;
                case 45: goto L24;
                case 46: goto L24;
                case 47: goto L24;
                case 48: goto L25;
                case 49: goto L25;
                case 50: goto L25;
                case 51: goto L25;
                case 52: goto L25;
                case 53: goto L25;
                case 54: goto L25;
                case 55: goto L25;
                default: goto L24;
            }
        L24:
            goto L28
        L25:
            if (r6 == 0) goto L28
            return r1
        L28:
            switch(r4) {
                case 0: goto L2f;
                case 1: goto L2f;
                case 2: goto L2f;
                case 3: goto L2f;
                case 4: goto L2f;
                case 5: goto L2f;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                default: goto L2b;
            }
        L2b:
            switch(r4) {
                case 16: goto L2f;
                case 17: goto L2f;
                case 18: goto L2f;
                case 19: goto L2f;
                case 20: goto L2f;
                case 21: goto L2f;
                default: goto L2e;
            }
        L2e:
            return r2
        L2f:
            r4 = 50
            byte[] r4 = new byte[r4]
            r5.position(r2)
            r5.get(r4)
            r4 = 2
            r5.position(r4)
            int r4 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            if (r6 == 0) goto L48
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 <= 0) goto L48
            return r1
        L48:
            return r2
    }

    public void profile_tier_level(int r20, com.googlecode.mp4parser.h264.read.CAVLCReader r21) throws java.io.IOException {
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.String r3 = "general_profile_space "
            r1.readU(r2, r3)
            java.lang.String r3 = "general_tier_flag"
            r1.readBool(r3)
            r3 = 5
            java.lang.String r4 = "general_profile_idc"
            r1.readU(r3, r4)
            r4 = 32
            boolean[] r5 = new boolean[r4]
            r6 = 0
            r7 = 0
        L1b:
            java.lang.String r8 = "]"
            if (r7 < r4) goto L1b4
            java.lang.String r5 = "general_progressive_source_flag"
            r1.readBool(r5)
            java.lang.String r5 = "general_interlaced_source_flag"
            r1.readBool(r5)
            java.lang.String r5 = "general_non_packed_constraint_flag"
            r1.readBool(r5)
            java.lang.String r5 = "general_frame_only_constraint_flag"
            r1.readBool(r5)
            r9 = 44
            java.lang.String r5 = "general_reserved_zero_44bits"
            r1.readU(r9, r5)
            r10 = 8
            java.lang.String r5 = "general_level_idc"
            r1.readU(r10, r5)
            boolean[] r11 = new boolean[r0]
            boolean[] r12 = new boolean[r0]
            r5 = 0
        L46:
            if (r5 < r0) goto L175
            if (r0 <= 0) goto L56
            r5 = r0
        L4b:
            if (r5 < r10) goto L4e
            goto L56
        L4e:
            java.lang.String r7 = "reserved_zero_2bits"
            r1.readU(r2, r7)
            int r5 = r5 + 1
            goto L4b
        L56:
            int[] r7 = new int[r0]
            boolean[] r13 = new boolean[r0]
            int[] r14 = new int[r0]
            int[] r5 = new int[r2]
            r15 = 1
            r5[r15] = r4
            r5[r6] = r0
            java.lang.Class<boolean> r15 = boolean.class
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r15, r5)
            r15 = r5
            boolean[][] r15 = (boolean[][]) r15
            boolean[] r5 = new boolean[r0]
            boolean[] r6 = new boolean[r0]
            boolean[] r10 = new boolean[r0]
            boolean[] r9 = new boolean[r0]
            int[] r4 = new int[r0]
            r3 = 0
        L77:
            if (r3 < r0) goto L7a
            return
        L7a:
            boolean r17 = r11[r3]
            if (r17 == 0) goto L159
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "sub_layer_profile_space["
            r2.<init>(r0)
            r2.append(r3)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            r2 = 2
            int r0 = r1.readU(r2, r0)
            r7[r3] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_tier_flag["
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r13[r3] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_profile_idc["
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r2 = 5
            int r0 = r1.readU(r2, r0)
            r14[r3] = r0
            r0 = 0
        Lc6:
            r2 = 32
            if (r0 < r2) goto L12e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_progressive_source_flag["
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r5[r3] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_interlaced_source_flag["
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r6[r3] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_non_packed_constraint_flag["
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r10[r3] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_frame_only_constraint_flag["
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r9[r3] = r0
            java.lang.String r0 = "reserved"
            r2 = 44
            r1.readNBit(r2, r0)
            goto L159
        L12e:
            r2 = 44
            r16 = r15[r3]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r18 = r5
            java.lang.String r5 = "sub_layer_profile_compatibility_flag["
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r5 = "]["
            r2.append(r5)
            r2.append(r0)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            boolean r2 = r1.readBool(r2)
            r16[r0] = r2
            int r0 = r0 + 1
            r5 = r18
            goto Lc6
        L159:
            r18 = r5
            boolean r0 = r12[r3]
            if (r0 == 0) goto L16a
            java.lang.String r0 = "sub_layer_level_idc"
            r2 = 8
            int r0 = r1.readU(r2, r0)
            r4[r3] = r0
            goto L16c
        L16a:
            r2 = 8
        L16c:
            int r3 = r3 + 1
            r0 = r20
            r5 = r18
            r2 = 2
            goto L77
        L175:
            r2 = 8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "sub_layer_profile_present_flag["
            r0.<init>(r3)
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r11[r5] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "sub_layer_level_present_flag["
            r0.<init>(r3)
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r12[r5] = r0
            int r5 = r5 + 1
            r0 = r20
            r2 = 2
            r3 = 5
            r4 = 32
            r6 = 0
            r9 = 44
            r10 = 8
            goto L46
        L1b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "general_profile_compatibility_flag["
            r0.<init>(r2)
            r0.append(r7)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r5[r7] = r0
            int r7 = r7 + 1
            r0 = r20
            r2 = 2
            r3 = 5
            r4 = 32
            r6 = 0
            goto L1b
    }

    void sub_layer_hrd_parameters(int r9, int r10, boolean r11, com.googlecode.mp4parser.h264.read.CAVLCReader r12) throws java.io.IOException {
            r8 = this;
            int[] r9 = new int[r10]
            int[] r0 = new int[r10]
            int[] r1 = new int[r10]
            int[] r2 = new int[r10]
            boolean[] r3 = new boolean[r10]
            r4 = 0
        Lb:
            if (r4 <= r10) goto Le
            return
        Le:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "bit_rate_value_minus1["
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r6 = "]"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = r12.readUE(r5)
            r9[r4] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "cpb_size_value_minus1["
            r5.<init>(r7)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = r12.readUE(r5)
            r0[r4] = r5
            if (r11 == 0) goto L6e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "cpb_size_du_value_minus1["
            r5.<init>(r7)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = r12.readUE(r5)
            r1[r4] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "bit_rate_du_value_minus1["
            r5.<init>(r7)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = r12.readUE(r5)
            r2[r4] = r5
        L6e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "cbr_flag["
            r5.<init>(r7)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r5 = r12.readBool(r5)
            r3[r4] = r5
            int r4 = r4 + 1
            goto Lb
    }
}
