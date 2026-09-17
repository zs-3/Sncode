package com.googlecode.mp4parser.authoring.tracks.h264;

/* loaded from: classes2.dex */
public class H264TrackImpl extends com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack {
    private static final java.util.logging.Logger LOG = null;
    com.googlecode.mp4parser.h264.model.PictureParameterSet currentPictureParameterSet;
    com.googlecode.mp4parser.h264.model.SeqParameterSet currentSeqParameterSet;
    private boolean determineFrameRate;
    com.googlecode.mp4parser.h264.model.PictureParameterSet firstPictureParameterSet;
    com.googlecode.mp4parser.h264.model.SeqParameterSet firstSeqParameterSet;
    int frameNrInGop;
    private int frametick;
    private int height;
    private java.lang.String lang;
    int[] pictureOrderCounts;
    com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, byte[]> pictureParameterRangeMap;
    java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.PictureParameterSet> ppsIdToPps;
    java.util.Map<java.lang.Integer, byte[]> ppsIdToPpsBytes;
    int prevPicOrderCntLsb;
    int prevPicOrderCntMsb;
    com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    private com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.SEIMessage seiMessage;
    com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, byte[]> seqParameterRangeMap;
    java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.SeqParameterSet> spsIdToSps;
    java.util.Map<java.lang.Integer, byte[]> spsIdToSpsBytes;
    private long timescale;
    private int width;


    public class ByteBufferBackedInputStream extends java.io.InputStream {
        private final java.nio.ByteBuffer buf;
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl this$0;

        public ByteBufferBackedInputStream(com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r1, java.nio.ByteBuffer r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.nio.ByteBuffer r1 = r2.duplicate()
                r0.buf = r1
                return
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buf
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r0 = -1
                return r0
            La:
                java.nio.ByteBuffer r0 = r1.buf
                byte r0 = r0.get()
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buf
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r2 = -1
                return r2
            La:
                java.nio.ByteBuffer r0 = r1.buf
                int r0 = r0.remaining()
                int r4 = java.lang.Math.min(r4, r0)
                java.nio.ByteBuffer r0 = r1.buf
                r0.get(r2, r3, r4)
                return r4
        }
    }

    public class SEIMessage {
        boolean clock_timestamp_flag;
        int cnt_dropped_flag;
        int counting_type;
        int cpb_removal_delay;
        int ct_type;
        int discontinuity_flag;
        int dpb_removal_delay;
        int full_timestamp_flag;
        int hours_value;
        int minutes_value;
        int n_frames;
        int nuit_field_based_flag;
        int payloadSize;
        int payloadType;
        int pic_struct;
        boolean removal_delay_flag;
        int seconds_value;
        com.googlecode.mp4parser.h264.model.SeqParameterSet sps;
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl this$0;
        int time_offset;
        int time_offset_length;

        public SEIMessage(com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r17, java.io.InputStream r18, com.googlecode.mp4parser.h264.model.SeqParameterSet r19) throws java.io.IOException {
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r19
                r0.this$0 = r1
                r16.<init>()
                r1 = 0
                r0.payloadType = r1
                r0.payloadSize = r1
                r0.sps = r2
                r18.read()
                int r3 = r18.available()
                r4 = 0
            L1a:
                if (r4 < r3) goto L1d
                return
            L1d:
                r0.payloadType = r1
                r0.payloadSize = r1
                int r5 = r18.read()
                int r4 = r4 + 1
            L27:
                r6 = 255(0xff, float:3.57E-43)
                if (r5 == r6) goto L1b5
                int r7 = r0.payloadType
                int r7 = r7 + r5
                r0.payloadType = r7
                int r5 = r18.read()
                int r4 = r4 + 1
            L36:
                if (r5 == r6) goto L1a5
                int r6 = r0.payloadSize
                int r6 = r6 + r5
                r0.payloadSize = r6
                int r5 = r3 - r4
                if (r5 < r6) goto L194
                int r5 = r0.payloadType
                r7 = 1
                if (r5 != r7) goto L184
                com.googlecode.mp4parser.h264.model.VUIParameters r5 = r2.vuiParams
                if (r5 == 0) goto L174
                com.googlecode.mp4parser.h264.model.HRDParameters r8 = r5.nalHRDParams
                if (r8 != 0) goto L56
                com.googlecode.mp4parser.h264.model.HRDParameters r8 = r5.vclHRDParams
                if (r8 != 0) goto L56
                boolean r5 = r5.pic_struct_present_flag
                if (r5 == 0) goto L174
            L56:
                byte[] r5 = new byte[r6]
                r8 = r18
                r8.read(r5)
                int r6 = r0.payloadSize
                int r4 = r4 + r6
                com.googlecode.mp4parser.h264.read.CAVLCReader r6 = new com.googlecode.mp4parser.h264.read.CAVLCReader
                java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
                r9.<init>(r5)
                r6.<init>(r9)
                com.googlecode.mp4parser.h264.model.VUIParameters r5 = r2.vuiParams
                com.googlecode.mp4parser.h264.model.HRDParameters r9 = r5.nalHRDParams
                if (r9 != 0) goto L78
                com.googlecode.mp4parser.h264.model.HRDParameters r5 = r5.vclHRDParams
                if (r5 == 0) goto L75
                goto L78
            L75:
                r0.removal_delay_flag = r1
                goto L94
            L78:
                r0.removal_delay_flag = r7
                int r5 = r9.cpb_removal_delay_length_minus1
                int r5 = r5 + r7
                java.lang.String r9 = "SEI: cpb_removal_delay"
                int r5 = r6.readU(r5, r9)
                r0.cpb_removal_delay = r5
                com.googlecode.mp4parser.h264.model.VUIParameters r5 = r2.vuiParams
                com.googlecode.mp4parser.h264.model.HRDParameters r5 = r5.nalHRDParams
                int r5 = r5.dpb_output_delay_length_minus1
                int r5 = r5 + r7
                java.lang.String r9 = "SEI: dpb_removal_delay"
                int r5 = r6.readU(r5, r9)
                r0.dpb_removal_delay = r5
            L94:
                com.googlecode.mp4parser.h264.model.VUIParameters r5 = r2.vuiParams
                boolean r5 = r5.pic_struct_present_flag
                if (r5 == 0) goto L197
                r5 = 4
                java.lang.String r9 = "SEI: pic_struct"
                int r5 = r6.readU(r5, r9)
                r0.pic_struct = r5
                r9 = 2
                switch(r5) {
                    case 3: goto Lab;
                    case 4: goto Lab;
                    case 5: goto La9;
                    case 6: goto La9;
                    case 7: goto Lab;
                    case 8: goto La9;
                    default: goto La7;
                }
            La7:
                r5 = 1
                goto Lac
            La9:
                r5 = 3
                goto Lac
            Lab:
                r5 = 2
            Lac:
                r10 = 0
            Lad:
                if (r10 < r5) goto Lb1
                goto L197
            Lb1:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r12 = "pic_timing SEI: clock_timestamp_flag["
                r11.<init>(r12)
                r11.append(r10)
                java.lang.String r12 = "]"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                boolean r11 = r6.readBool(r11)
                r0.clock_timestamp_flag = r11
                if (r11 == 0) goto L16f
                java.lang.String r11 = "pic_timing SEI: ct_type"
                int r11 = r6.readU(r9, r11)
                r0.ct_type = r11
                java.lang.String r11 = "pic_timing SEI: nuit_field_based_flag"
                int r11 = r6.readU(r7, r11)
                r0.nuit_field_based_flag = r11
                r11 = 5
                java.lang.String r12 = "pic_timing SEI: counting_type"
                int r12 = r6.readU(r11, r12)
                r0.counting_type = r12
                java.lang.String r12 = "pic_timing SEI: full_timestamp_flag"
                int r12 = r6.readU(r7, r12)
                r0.full_timestamp_flag = r12
                java.lang.String r12 = "pic_timing SEI: discontinuity_flag"
                int r12 = r6.readU(r7, r12)
                r0.discontinuity_flag = r12
                java.lang.String r12 = "pic_timing SEI: cnt_dropped_flag"
                int r12 = r6.readU(r7, r12)
                r0.cnt_dropped_flag = r12
                r12 = 8
                java.lang.String r13 = "pic_timing SEI: n_frames"
                int r12 = r6.readU(r12, r13)
                r0.n_frames = r12
                int r12 = r0.full_timestamp_flag
                java.lang.String r13 = "pic_timing SEI: hours_value"
                java.lang.String r14 = "pic_timing SEI: minutes_value"
                java.lang.String r15 = "pic_timing SEI: seconds_value"
                r1 = 6
                if (r12 != r7) goto L125
                int r12 = r6.readU(r1, r15)
                r0.seconds_value = r12
                int r1 = r6.readU(r1, r14)
                r0.minutes_value = r1
                int r1 = r6.readU(r11, r13)
                r0.hours_value = r1
                goto L14f
            L125:
                java.lang.String r12 = "pic_timing SEI: seconds_flag"
                boolean r12 = r6.readBool(r12)
                if (r12 == 0) goto L14f
                int r12 = r6.readU(r1, r15)
                r0.seconds_value = r12
                java.lang.String r12 = "pic_timing SEI: minutes_flag"
                boolean r12 = r6.readBool(r12)
                if (r12 == 0) goto L14f
                int r1 = r6.readU(r1, r14)
                r0.minutes_value = r1
                java.lang.String r1 = "pic_timing SEI: hours_flag"
                boolean r1 = r6.readBool(r1)
                if (r1 == 0) goto L14f
                int r1 = r6.readU(r11, r13)
                r0.hours_value = r1
            L14f:
                com.googlecode.mp4parser.h264.model.VUIParameters r1 = r2.vuiParams
                com.googlecode.mp4parser.h264.model.HRDParameters r11 = r1.nalHRDParams
                r12 = 24
                if (r11 == 0) goto L15c
                int r1 = r11.time_offset_length
                r0.time_offset_length = r1
                goto L167
            L15c:
                com.googlecode.mp4parser.h264.model.HRDParameters r1 = r1.vclHRDParams
                if (r1 == 0) goto L165
                int r1 = r1.time_offset_length
                r0.time_offset_length = r1
                goto L167
            L165:
                r0.time_offset_length = r12
            L167:
                java.lang.String r1 = "pic_timing SEI: time_offset"
                int r1 = r6.readU(r12, r1)
                r0.time_offset = r1
            L16f:
                int r10 = r10 + 1
                r1 = 0
                goto Lad
            L174:
                r8 = r18
                r1 = 0
            L177:
                int r5 = r0.payloadSize
                if (r1 < r5) goto L17c
                goto L197
            L17c:
                r18.read()
                int r4 = r4 + 1
                int r1 = r1 + 1
                goto L177
            L184:
                r8 = r18
                r1 = 0
            L187:
                int r5 = r0.payloadSize
                if (r1 < r5) goto L18c
                goto L197
            L18c:
                r18.read()
                int r4 = r4 + 1
                int r1 = r1 + 1
                goto L187
            L194:
                r8 = r18
                r4 = r3
            L197:
                java.util.logging.Logger r1 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.access$0()
                java.lang.String r5 = r16.toString()
                r1.fine(r5)
                r1 = 0
                goto L1a
            L1a5:
                r8 = r18
                int r1 = r0.payloadSize
                int r1 = r1 + r5
                r0.payloadSize = r1
                int r5 = r18.read()
                int r4 = r4 + 1
                r1 = 0
                goto L36
            L1b5:
                r8 = r18
                int r1 = r0.payloadType
                int r1 = r1 + r5
                r0.payloadType = r1
                int r5 = r18.read()
                int r4 = r4 + 1
                r1 = 0
                goto L27
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SEIMessage{payloadType="
                r0.<init>(r1)
                int r1 = r3.payloadType
                r0.append(r1)
                java.lang.String r1 = ", payloadSize="
                r0.append(r1)
                int r1 = r3.payloadSize
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                int r1 = r3.payloadType
                r2 = 1
                if (r1 != r2) goto Lf4
                com.googlecode.mp4parser.h264.model.SeqParameterSet r1 = r3.sps
                com.googlecode.mp4parser.h264.model.VUIParameters r1 = r1.vuiParams
                com.googlecode.mp4parser.h264.model.HRDParameters r2 = r1.nalHRDParams
                if (r2 != 0) goto L2b
                com.googlecode.mp4parser.h264.model.HRDParameters r1 = r1.vclHRDParams
                if (r1 == 0) goto L4c
            L2b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1.<init>(r0)
                java.lang.String r0 = ", cpb_removal_delay="
                r1.append(r0)
                int r0 = r3.cpb_removal_delay
                r1.append(r0)
                java.lang.String r0 = ", dpb_removal_delay="
                r1.append(r0)
                int r0 = r3.dpb_removal_delay
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L4c:
                com.googlecode.mp4parser.h264.model.SeqParameterSet r1 = r3.sps
                com.googlecode.mp4parser.h264.model.VUIParameters r1 = r1.vuiParams
                boolean r1 = r1.pic_struct_present_flag
                if (r1 == 0) goto Lf4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1.<init>(r0)
                java.lang.String r0 = ", pic_struct="
                r1.append(r0)
                int r0 = r3.pic_struct
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                boolean r1 = r3.clock_timestamp_flag
                if (r1 == 0) goto Lf4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1.<init>(r0)
                java.lang.String r0 = ", ct_type="
                r1.append(r0)
                int r0 = r3.ct_type
                r1.append(r0)
                java.lang.String r0 = ", nuit_field_based_flag="
                r1.append(r0)
                int r0 = r3.nuit_field_based_flag
                r1.append(r0)
                java.lang.String r0 = ", counting_type="
                r1.append(r0)
                int r0 = r3.counting_type
                r1.append(r0)
                java.lang.String r0 = ", full_timestamp_flag="
                r1.append(r0)
                int r0 = r3.full_timestamp_flag
                r1.append(r0)
                java.lang.String r0 = ", discontinuity_flag="
                r1.append(r0)
                int r0 = r3.discontinuity_flag
                r1.append(r0)
                java.lang.String r0 = ", cnt_dropped_flag="
                r1.append(r0)
                int r0 = r3.cnt_dropped_flag
                r1.append(r0)
                java.lang.String r0 = ", n_frames="
                r1.append(r0)
                int r0 = r3.n_frames
                r1.append(r0)
                java.lang.String r0 = ", seconds_value="
                r1.append(r0)
                int r0 = r3.seconds_value
                r1.append(r0)
                java.lang.String r0 = ", minutes_value="
                r1.append(r0)
                int r0 = r3.minutes_value
                r1.append(r0)
                java.lang.String r0 = ", hours_value="
                r1.append(r0)
                int r0 = r3.hours_value
                r1.append(r0)
                java.lang.String r0 = ", time_offset_length="
                r1.append(r0)
                int r0 = r3.time_offset_length
                r1.append(r0)
                java.lang.String r0 = ", time_offset="
                r1.append(r0)
                int r0 = r3.time_offset
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            Lf4:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1.<init>(r0)
                r0 = 125(0x7d, float:1.75E-43)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl> r0 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG = r0
            return
    }

    public H264TrackImpl(com.googlecode.mp4parser.DataSource r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "eng"
            r1.<init>(r2, r0)
            return
    }

    public H264TrackImpl(com.googlecode.mp4parser.DataSource r7, java.lang.String r8) throws java.io.IOException {
            r6 = this;
            r3 = -1
            r5 = -1
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public H264TrackImpl(com.googlecode.mp4parser.DataSource r4, java.lang.String r5, long r6, int r8) throws java.io.IOException {
            r3 = this;
            r3.<init>(r4)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.spsIdToSpsBytes = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.spsIdToSps = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.ppsIdToPpsBytes = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.ppsIdToPps = r0
            r0 = 0
            r3.firstSeqParameterSet = r0
            r3.firstPictureParameterSet = r0
            r3.currentSeqParameterSet = r0
            r3.currentPictureParameterSet = r0
            com.googlecode.mp4parser.util.RangeStartMap r0 = new com.googlecode.mp4parser.util.RangeStartMap
            r0.<init>()
            r3.seqParameterRangeMap = r0
            com.googlecode.mp4parser.util.RangeStartMap r0 = new com.googlecode.mp4parser.util.RangeStartMap
            r0.<init>()
            r3.pictureParameterRangeMap = r0
            r0 = 0
            r3.frameNrInGop = r0
            r1 = 1
            r3.determineFrameRate = r1
            int[] r1 = new int[r0]
            r3.pictureOrderCounts = r1
            r3.prevPicOrderCntLsb = r0
            r3.prevPicOrderCntMsb = r0
            r3.lang = r5
            r3.timescale = r6
            r3.frametick = r8
            r1 = 0
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 <= 0) goto L54
            if (r8 <= 0) goto L54
            r3.determineFrameRate = r0
        L54:
            com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead r5 = new com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead
            r5.<init>(r4)
            r3.parse(r5)
            return
    }

    static /* synthetic */ java.util.logging.Logger access$0() {
            java.util.logging.Logger r0 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            return r0
    }

    static /* synthetic */ java.io.InputStream access$1(java.io.InputStream r0) {
            java.io.InputStream r0 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.cleanBuffer(r0)
            return r0
    }

    private int calcPOC0(com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r5, com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader r6) {
            r4 = this;
            int r0 = r6.pic_order_cnt_lsb
            com.googlecode.mp4parser.h264.model.SeqParameterSet r6 = r6.sps
            int r6 = r6.log2_max_pic_order_cnt_lsb_minus4
            int r6 = r6 + 4
            r1 = 1
            int r6 = r1 << r6
            int r1 = r4.prevPicOrderCntLsb
            if (r0 >= r1) goto L19
            int r2 = r1 - r0
            int r3 = r6 / 2
            if (r2 < r3) goto L19
            int r1 = r4.prevPicOrderCntMsb
            int r1 = r1 + r6
            goto L27
        L19:
            if (r0 <= r1) goto L25
            int r1 = r0 - r1
            int r2 = r6 / 2
            if (r1 <= r2) goto L25
            int r1 = r4.prevPicOrderCntMsb
            int r1 = r1 - r6
            goto L27
        L25:
            int r1 = r4.prevPicOrderCntMsb
        L27:
            int r5 = r5.nal_ref_idc
            if (r5 == 0) goto L2f
            r4.prevPicOrderCntMsb = r1
            r4.prevPicOrderCntLsb = r0
        L2f:
            int r1 = r1 + r0
            return r1
    }

    private int calcPOC1(int r6, com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r7, com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader r8) {
            r5 = this;
            com.googlecode.mp4parser.h264.model.SeqParameterSet r0 = r8.sps
            int r0 = r0.num_ref_frames_in_pic_order_cnt_cycle
            r1 = 0
            if (r0 != 0) goto L8
            r6 = 0
        L8:
            int r0 = r7.nal_ref_idc
            if (r0 != 0) goto L10
            if (r6 <= 0) goto L10
            int r6 = r6 + (-1)
        L10:
            r0 = 0
            r2 = 0
        L12:
            com.googlecode.mp4parser.h264.model.SeqParameterSet r3 = r8.sps
            int r4 = r3.num_ref_frames_in_pic_order_cnt_cycle
            if (r0 < r4) goto L3c
            if (r6 <= 0) goto L2f
            int r6 = r6 + (-1)
            int r0 = r6 / r4
            int r6 = r6 % r4
            int r0 = r0 * r2
        L21:
            if (r1 <= r6) goto L25
            r1 = r0
            goto L2f
        L25:
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r8.sps
            int[] r2 = r2.offsetForRefFrame
            r2 = r2[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L21
        L2f:
            int r6 = r7.nal_ref_idc
            if (r6 != 0) goto L38
            com.googlecode.mp4parser.h264.model.SeqParameterSet r6 = r8.sps
            int r6 = r6.offset_for_non_ref_pic
            int r1 = r1 + r6
        L38:
            int r6 = r8.delta_pic_order_cnt_0
            int r1 = r1 + r6
            return r1
        L3c:
            int[] r3 = r3.offsetForRefFrame
            r3 = r3[r0]
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto L12
    }

    private int calcPOC2(int r1, com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r2, com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader r3) {
            r0 = this;
            int r2 = r2.nal_ref_idc
            if (r2 != 0) goto L9
            int r1 = r1 * 2
            int r1 = r1 + (-1)
            return r1
        L9:
            int r1 = r1 * 2
            return r1
    }

    private int calcPoc(int r3, com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r4, com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader r5) {
            r2 = this;
            com.googlecode.mp4parser.h264.model.SeqParameterSet r0 = r5.sps
            int r0 = r0.pic_order_cnt_type
            if (r0 != 0) goto Lb
            int r3 = r2.calcPOC0(r4, r5)
            return r3
        Lb:
            r1 = 1
            if (r0 != r1) goto L13
            int r3 = r2.calcPOC1(r3, r4, r5)
            return r3
        L13:
            int r3 = r2.calcPOC2(r3, r4, r5)
            return r3
    }

    private void configureFramerate() {
            r9 = this;
            boolean r0 = r9.determineFrameRate
            if (r0 == 0) goto L80
            com.googlecode.mp4parser.h264.model.SeqParameterSet r0 = r9.firstSeqParameterSet
            com.googlecode.mp4parser.h264.model.VUIParameters r0 = r0.vuiParams
            r1 = 3600(0xe10, float:5.045E-42)
            r2 = 90000(0x15f90, double:4.4466E-319)
            if (r0 == 0) goto L75
            int r4 = r0.time_scale
            int r4 = r4 >> 1
            long r4 = (long) r4
            r9.timescale = r4
            int r0 = r0.num_units_in_tick
            r9.frametick = r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L22
            if (r0 != 0) goto L4a
        L22:
            java.util.logging.Logger r0 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "vuiParams contain invalid values: time_scale: "
            r4.<init>(r5)
            long r5 = r9.timescale
            r4.append(r5)
            java.lang.String r5 = " and frame_tick: "
            r4.append(r5)
            int r5 = r9.frametick
            r4.append(r5)
            java.lang.String r5 = ". Setting frame rate to 25fps"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.warning(r4)
            r9.timescale = r2
            r9.frametick = r1
        L4a:
            long r0 = r9.timescale
            int r2 = r9.frametick
            long r2 = (long) r2
            long r0 = r0 / r2
            r2 = 100
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L80
            java.util.logging.Logger r0 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Framerate is "
            r1.<init>(r2)
            long r2 = r9.timescale
            int r4 = r9.frametick
            long r4 = (long) r4
            long r2 = r2 / r4
            r1.append(r2)
            java.lang.String r2 = ". That is suspicious."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.warning(r1)
            goto L80
        L75:
            java.util.logging.Logger r0 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.String r4 = "Can't determine frame rate. Guessing 25 fps"
            r0.warning(r4)
            r9.timescale = r2
            r9.frametick = r1
        L80:
            return
    }

    private void createSample(java.util.List<java.nio.ByteBuffer> r12) throws java.io.IOException {
            r11 = this;
            com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry r0 = new com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry
            r1 = 0
            r0.<init>(r1)
            java.util.Iterator r2 = r12.iterator()
            r3 = 0
            r4 = 0
        Lc:
            boolean r5 = r2.hasNext()
            r6 = 4
            r7 = 2
            r8 = 1
            if (r5 != 0) goto Lea
            if (r3 != 0) goto L1f
            java.util.logging.Logger r12 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.String r0 = "Sample without Slice"
            r12.warning(r0)
            return
        L1f:
            if (r4 == 0) goto L24
            r11.calcCtts()
        L24:
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream r2 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream
            int r5 = r12.size()
            int r5 = r5 - r8
            java.lang.Object r5 = r12.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            r2.<init>(r11, r5)
            java.io.InputStream r2 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.cleanBuffer(r2)
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader r5 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader
            java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.SeqParameterSet> r9 = r11.spsIdToSps
            java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.PictureParameterSet> r10 = r11.ppsIdToPps
            r5.<init>(r2, r9, r10, r4)
            int r2 = r3.nal_ref_idc
            if (r2 != 0) goto L49
            r0.setSampleIsDependentOn(r7)
            goto L4c
        L49:
            r0.setSampleIsDependentOn(r8)
        L4c:
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r2 = r5.slice_type
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r3 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.I
            if (r2 == r3) goto L5b
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r3 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.SI
            if (r2 != r3) goto L57
            goto L5b
        L57:
            r0.setSampleDependsOn(r8)
            goto L5e
        L5b:
            r0.setSampleDependsOn(r7)
        L5e:
            com.googlecode.mp4parser.authoring.Sample r2 = r11.createSampleObject(r12)
            r12.clear()
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$SEIMessage r12 = r11.seiMessage
            if (r12 == 0) goto L6d
            int r12 = r12.n_frames
            if (r12 != 0) goto L6f
        L6d:
            r11.frameNrInGop = r1
        L6f:
            com.googlecode.mp4parser.h264.model.SeqParameterSet r12 = r5.sps
            int r3 = r12.pic_order_cnt_type
            if (r3 != 0) goto Lab
            int r12 = r12.log2_max_pic_order_cnt_lsb_minus4
            int r12 = r12 + r6
            int r12 = r8 << r12
            int r3 = r5.pic_order_cnt_lsb
            int r5 = r11.prevPicOrderCntLsb
            if (r3 >= r5) goto L8a
            int r6 = r5 - r3
            int r7 = r12 / 2
            if (r6 < r7) goto L8a
            int r5 = r11.prevPicOrderCntMsb
            int r5 = r5 + r12
            goto L98
        L8a:
            if (r3 <= r5) goto L96
            int r5 = r3 - r5
            int r6 = r12 / 2
            if (r5 <= r6) goto L96
            int r5 = r11.prevPicOrderCntMsb
            int r5 = r5 - r12
            goto L98
        L96:
            int r5 = r11.prevPicOrderCntMsb
        L98:
            int[] r12 = r11.pictureOrderCounts
            int[] r6 = new int[r8]
            int r7 = r5 + r3
            r6[r1] = r7
            int[] r12 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r12, r6)
            r11.pictureOrderCounts = r12
            r11.prevPicOrderCntLsb = r3
            r11.prevPicOrderCntMsb = r5
            goto Lc1
        Lab:
            if (r3 == r8) goto Le2
            if (r3 != r7) goto Lc1
            int[] r12 = r11.pictureOrderCounts
            int[] r3 = new int[r8]
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r5 = r11.samples
            int r5 = r5.size()
            r3[r1] = r5
            int[] r12 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r12, r3)
            r11.pictureOrderCounts = r12
        Lc1:
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r12 = r11.sdtp
            r12.add(r0)
            int r12 = r11.frameNrInGop
            int r12 = r12 + r8
            r11.frameNrInGop = r12
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r12 = r11.samples
            r12.add(r2)
            if (r4 == 0) goto Le1
            java.util.List<java.lang.Integer> r12 = r11.stss
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r11.samples
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.add(r0)
        Le1:
            return
        Le2:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "pic_order_cnt_type == 1 needs to be implemented"
            r12.<init>(r0)
            throw r12
        Lea:
            java.lang.Object r5 = r2.next()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r5 = getNalUnitHeader(r5)
            int r9 = r5.nal_unit_type
            if (r9 == r8) goto L105
            if (r9 == r7) goto L105
            r7 = 3
            if (r9 == r7) goto L105
            if (r9 == r6) goto L105
            r6 = 5
            if (r9 == r6) goto L104
            goto Lc
        L104:
            r4 = 1
        L105:
            r3 = r5
            goto Lc
    }

    public static com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader getNalUnitHeader(java.nio.ByteBuffer r2) {
            com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r0 = new com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader
            r0.<init>()
            r1 = 0
            byte r2 = r2.get(r1)
            int r1 = r2 >> 5
            r1 = r1 & 3
            r0.nal_ref_idc = r1
            r2 = r2 & 31
            r0.nal_unit_type = r2
            return r0
    }

    private void handlePPS(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream r0 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream
            r0.<init>(r3, r4)
            r0.read()
            com.googlecode.mp4parser.h264.model.PictureParameterSet r0 = com.googlecode.mp4parser.h264.model.PictureParameterSet.read(r0)
            com.googlecode.mp4parser.h264.model.PictureParameterSet r1 = r3.firstPictureParameterSet
            if (r1 != 0) goto L12
            r3.firstPictureParameterSet = r0
        L12:
            r3.currentPictureParameterSet = r0
            java.nio.Buffer r4 = r4.rewind()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            byte[] r4 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.toArray(r4)
            java.util.Map<java.lang.Integer, byte[]> r1 = r3.ppsIdToPpsBytes
            int r2 = r0.pic_parameter_set_id
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L3d
            boolean r2 = java.util.Arrays.equals(r1, r4)
            if (r2 == 0) goto L35
            goto L3d
        L35:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "OMG - I got two SPS with same ID but different settings! (AVC3 is the solution)"
            r4.<init>(r0)
            throw r4
        L3d:
            if (r1 != 0) goto L4e
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, byte[]> r1 = r3.pictureParameterRangeMap
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r2 = r3.samples
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r4)
        L4e:
            java.util.Map<java.lang.Integer, byte[]> r1 = r3.ppsIdToPpsBytes
            int r2 = r0.pic_parameter_set_id
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r4)
            java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.PictureParameterSet> r4 = r3.ppsIdToPps
            int r1 = r0.pic_parameter_set_id
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r1, r0)
            return
    }

    private void handleSPS(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream r0 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream
            r0.<init>(r3, r4)
            java.io.InputStream r0 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.cleanBuffer(r0)
            r0.read()
            com.googlecode.mp4parser.h264.model.SeqParameterSet r0 = com.googlecode.mp4parser.h264.model.SeqParameterSet.read(r0)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r1 = r3.firstSeqParameterSet
            if (r1 != 0) goto L19
            r3.firstSeqParameterSet = r0
            r3.configureFramerate()
        L19:
            r3.currentSeqParameterSet = r0
            java.nio.Buffer r4 = r4.rewind()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            byte[] r4 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.toArray(r4)
            java.util.Map<java.lang.Integer, byte[]> r1 = r3.spsIdToSpsBytes
            int r2 = r0.seq_parameter_set_id
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L44
            boolean r2 = java.util.Arrays.equals(r1, r4)
            if (r2 == 0) goto L3c
            goto L44
        L3c:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "OMG - I got two SPS with same ID but different settings!"
            r4.<init>(r0)
            throw r4
        L44:
            if (r1 == 0) goto L55
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, byte[]> r1 = r3.seqParameterRangeMap
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r2 = r3.samples
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r4)
        L55:
            java.util.Map<java.lang.Integer, byte[]> r1 = r3.spsIdToSpsBytes
            int r2 = r0.seq_parameter_set_id
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r4)
            java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.SeqParameterSet> r4 = r3.spsIdToSps
            int r1 = r0.seq_parameter_set_id
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r1, r0)
            return
    }

    private void parse(com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.LookAhead r8) throws java.io.IOException {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.samples = r0
            boolean r8 = r7.readSamples(r8)
            if (r8 == 0) goto L10b
            boolean r8 = r7.readVariables()
            if (r8 == 0) goto L105
            com.coremedia.iso.boxes.SampleDescriptionBox r8 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r8.<init>()
            r7.sampleDescriptionBox = r8
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r8 = new com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            java.lang.String r0 = "avc1"
            r8.<init>(r0)
            r0 = 1
            r8.setDataReferenceIndex(r0)
            r1 = 24
            r8.setDepth(r1)
            r8.setFrameCount(r0)
            r1 = 4634766966517661696(0x4052000000000000, double:72.0)
            r8.setHorizresolution(r1)
            r8.setVertresolution(r1)
            int r1 = r7.width
            r8.setWidth(r1)
            int r1 = r7.height
            r8.setHeight(r1)
            java.lang.String r1 = "AVC Coding"
            r8.setCompressorname(r1)
            com.mp4parser.iso14496.part15.AvcConfigurationBox r1 = new com.mp4parser.iso14496.part15.AvcConfigurationBox
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, byte[]> r3 = r7.spsIdToSpsBytes
            java.util.Collection r3 = r3.values()
            r2.<init>(r3)
            r1.setSequenceParameterSets(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, byte[]> r3 = r7.ppsIdToPpsBytes
            java.util.Collection r3 = r3.values()
            r2.<init>(r3)
            r1.setPictureParameterSets(r2)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r7.firstSeqParameterSet
            int r2 = r2.level_idc
            r1.setAvcLevelIndication(r2)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r7.firstSeqParameterSet
            int r2 = r2.profile_idc
            r1.setAvcProfileIndication(r2)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r7.firstSeqParameterSet
            int r2 = r2.bit_depth_luma_minus8
            r1.setBitDepthLumaMinus8(r2)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r7.firstSeqParameterSet
            int r2 = r2.bit_depth_chroma_minus8
            r1.setBitDepthChromaMinus8(r2)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r7.firstSeqParameterSet
            com.googlecode.mp4parser.h264.model.ChromaFormat r2 = r2.chroma_format_idc
            int r2 = r2.getId()
            r1.setChromaFormat(r2)
            r1.setConfigurationVersion(r0)
            r0 = 3
            r1.setLengthSizeMinusOne(r0)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r0 = r7.firstSeqParameterSet
            boolean r2 = r0.constraint_set_0_flag
            r3 = 0
            if (r2 == 0) goto L9d
            r2 = 128(0x80, float:1.794E-43)
            goto L9e
        L9d:
            r2 = 0
        L9e:
            boolean r4 = r0.constraint_set_1_flag
            if (r4 == 0) goto La5
            r4 = 64
            goto La6
        La5:
            r4 = 0
        La6:
            int r2 = r2 + r4
            boolean r4 = r0.constraint_set_2_flag
            if (r4 == 0) goto Lae
            r4 = 32
            goto Laf
        Lae:
            r4 = 0
        Laf:
            int r2 = r2 + r4
            boolean r4 = r0.constraint_set_3_flag
            if (r4 == 0) goto Lb7
            r4 = 16
            goto Lb8
        Lb7:
            r4 = 0
        Lb8:
            int r2 = r2 + r4
            boolean r4 = r0.constraint_set_4_flag
            if (r4 == 0) goto Lbf
            r3 = 8
        Lbf:
            int r2 = r2 + r3
            long r3 = r0.reserved_zero_2bits
            r5 = 3
            long r3 = r3 & r5
            int r0 = (int) r3
            int r2 = r2 + r0
            r1.setProfileCompatibility(r2)
            r8.addBox(r1)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r7.sampleDescriptionBox
            r0.addBox(r8)
            com.googlecode.mp4parser.authoring.TrackMetaData r8 = r7.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r8.setCreationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r8 = r7.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r8.setModificationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r8 = r7.trackMetaData
            java.lang.String r0 = r7.lang
            r8.setLanguage(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r8 = r7.trackMetaData
            long r0 = r7.timescale
            r8.setTimescale(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r8 = r7.trackMetaData
            int r0 = r7.width
            double r0 = (double) r0
            r8.setWidth(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r8 = r7.trackMetaData
            int r0 = r7.height
            double r0 = (double) r0
            r8.setHeight(r0)
            return
        L105:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>()
            throw r8
        L10b:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>()
            throw r8
    }

    private boolean readSamples(com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.LookAhead r8) throws java.io.IOException {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            java.nio.ByteBuffer r3 = r7.findNextNal(r8)
            if (r3 != 0) goto Le
            goto L35
        Le:
            com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r4 = getNalUnitHeader(r3)
            int r5 = r4.nal_unit_type
            switch(r5) {
                case 1: goto Lb7;
                case 2: goto Lb7;
                case 3: goto Lb7;
                case 4: goto Lb7;
                case 5: goto Lb7;
                case 6: goto L93;
                case 7: goto L7b;
                case 8: goto L64;
                case 9: goto L53;
                case 10: goto L35;
                case 11: goto L35;
                case 12: goto L17;
                case 13: goto L2d;
                default: goto L17;
            }
        L17:
            java.util.logging.Logger r3 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown NAL unit type: "
            r5.<init>(r6)
            int r4 = r4.nal_unit_type
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.warning(r4)
            goto L7
        L2d:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Sequence parameter set extension is not yet handled. Needs TLC."
            r8.<init>(r0)
            throw r8
        L35:
            int r8 = r0.size()
            if (r8 <= 0) goto L3e
            r7.createSample(r0)
        L3e:
            r7.calcCtts()
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r8 = r7.samples
            int r8 = r8.size()
            long[] r8 = new long[r8]
            r7.decodingTimes = r8
            int r0 = r7.frametick
            long r0 = (long) r0
            java.util.Arrays.fill(r8, r0)
            r8 = 1
            return r8
        L53:
            if (r2 == 0) goto L60
            java.util.logging.Logger r2 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.String r4 = "Wrapping up cause of AU after vcl marks new sample"
            r2.finer(r4)
            r7.createSample(r0)
            r2 = r1
        L60:
            r0.add(r3)
            goto L7
        L64:
            if (r2 == 0) goto L71
            java.util.logging.Logger r2 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.String r4 = "Wrapping up cause of PPS after vcl marks new sample"
            r2.finer(r4)
            r7.createSample(r0)
            r2 = r1
        L71:
            java.nio.Buffer r3 = r3.rewind()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r7.handlePPS(r3)
            goto L7
        L7b:
            if (r2 == 0) goto L88
            java.util.logging.Logger r2 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.String r4 = "Wrapping up cause of SPS after vcl marks new sample"
            r2.finer(r4)
            r7.createSample(r0)
            r2 = r1
        L88:
            java.nio.Buffer r3 = r3.rewind()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r7.handleSPS(r3)
            goto L7
        L93:
            if (r2 == 0) goto La0
            java.util.logging.Logger r2 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.String r4 = "Wrapping up cause of SEI after vcl marks new sample"
            r2.finer(r4)
            r7.createSample(r0)
            r2 = r1
        La0:
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$SEIMessage r4 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$SEIMessage
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream r5 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$ByteBufferBackedInputStream
            r5.<init>(r7, r3)
            java.io.InputStream r5 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.cleanBuffer(r5)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r6 = r7.currentSeqParameterSet
            r4.<init>(r7, r5, r6)
            r7.seiMessage = r4
            r0.add(r3)
            goto L7
        Lb7:
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$1FirstVclNalDetector r6 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl$1FirstVclNalDetector
            int r4 = r4.nal_ref_idc
            r6.<init>(r7, r3, r4, r5)
            if (r2 == 0) goto Ld0
            boolean r2 = r2.isFirstInNew(r6)
            if (r2 == 0) goto Ld0
            java.util.logging.Logger r2 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.LOG
            java.lang.String r4 = "Wrapping up cause of first vcl nal is found"
            r2.finer(r4)
            r7.createSample(r0)
        Ld0:
            java.nio.Buffer r2 = r3.rewind()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0.add(r2)
            r2 = r6
            goto L7
    }

    private boolean readVariables() {
            r7 = this;
            com.googlecode.mp4parser.h264.model.SeqParameterSet r0 = r7.firstSeqParameterSet
            int r1 = r0.pic_width_in_mbs_minus1
            r2 = 1
            int r1 = r1 + r2
            int r1 = r1 * 16
            r7.width = r1
            boolean r1 = r0.frame_mbs_only_flag
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 2
        L11:
            int r3 = r0.pic_height_in_map_units_minus1
            int r3 = r3 + r2
            int r3 = r3 * 16
            int r3 = r3 * r1
            r7.height = r3
            boolean r3 = r0.frame_cropping_flag
            if (r3 == 0) goto L59
            r3 = 0
            boolean r4 = r0.residual_color_transform_flag
            if (r4 != 0) goto L29
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = r0.chroma_format_idc
            int r3 = r0.getId()
        L29:
            if (r3 == 0) goto L3e
            com.googlecode.mp4parser.h264.model.SeqParameterSet r0 = r7.firstSeqParameterSet
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = r0.chroma_format_idc
            int r0 = r0.getSubWidth()
            com.googlecode.mp4parser.h264.model.SeqParameterSet r3 = r7.firstSeqParameterSet
            com.googlecode.mp4parser.h264.model.ChromaFormat r3 = r3.chroma_format_idc
            int r3 = r3.getSubHeight()
            int r1 = r1 * r3
            goto L3f
        L3e:
            r0 = 1
        L3f:
            int r3 = r7.width
            com.googlecode.mp4parser.h264.model.SeqParameterSet r4 = r7.firstSeqParameterSet
            int r5 = r4.frame_crop_left_offset
            int r6 = r4.frame_crop_right_offset
            int r5 = r5 + r6
            int r0 = r0 * r5
            int r3 = r3 - r0
            r7.width = r3
            int r0 = r7.height
            int r3 = r4.frame_crop_top_offset
            int r4 = r4.frame_crop_bottom_offset
            int r3 = r3 + r4
            int r1 = r1 * r3
            int r0 = r0 - r1
            r7.height = r0
        L59:
            return r2
    }

    public void calcCtts() {
            r9 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
        L4:
            int[] r4 = r9.pictureOrderCounts
            int r4 = r4.length
            if (r2 < r4) goto L25
            r1 = 0
        La:
            int[] r2 = r9.pictureOrderCounts
            int r3 = r2.length
            if (r1 < r3) goto L14
            int[] r0 = new int[r0]
            r9.pictureOrderCounts = r0
            return
        L14:
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r3 = r9.ctts
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r4 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            r2 = r2[r1]
            int r2 = r2 - r1
            r5 = 1
            r4.<init>(r5, r2)
            r3.add(r4)
            int r1 = r1 + 1
            goto La
        L25:
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r2 + (-128)
            int r5 = java.lang.Math.max(r0, r5)
            r6 = 0
        L2f:
            int[] r7 = r9.pictureOrderCounts
            int r7 = r7.length
            int r8 = r2 + 128
            int r7 = java.lang.Math.min(r7, r8)
            if (r5 < r7) goto L47
            int[] r1 = r9.pictureOrderCounts
            r4 = r1[r6]
            int r5 = r3 + 1
            r1[r6] = r3
            int r2 = r2 + 1
            r1 = r4
            r3 = r5
            goto L4
        L47:
            int[] r7 = r9.pictureOrderCounts
            r8 = r7[r5]
            if (r8 <= r1) goto L54
            r8 = r7[r5]
            if (r8 >= r4) goto L54
            r4 = r7[r5]
            r6 = r5
        L54:
            int r5 = r5 + 1
            goto L2f
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "vide"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.sampleDescriptionBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }
}
