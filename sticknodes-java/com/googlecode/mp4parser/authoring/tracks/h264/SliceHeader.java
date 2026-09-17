package com.googlecode.mp4parser.authoring.tracks.h264;

/* loaded from: classes2.dex */
public class SliceHeader {
    public boolean bottom_field_flag;
    public int colour_plane_id;
    public int delta_pic_order_cnt_0;
    public int delta_pic_order_cnt_1;
    public int delta_pic_order_cnt_bottom;
    public boolean field_pic_flag;
    public int first_mb_in_slice;
    public int frame_num;
    public int idr_pic_id;
    public int pic_order_cnt_lsb;
    public int pic_parameter_set_id;
    com.googlecode.mp4parser.h264.model.PictureParameterSet pps;
    public com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType slice_type;
    com.googlecode.mp4parser.h264.model.SeqParameterSet sps;

    public enum SliceType extends java.lang.Enum<com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType> {
        public static final com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType B = null;
        private static final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType[] ENUM$VALUES = null;
        public static final com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType I = null;
        public static final com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType P = null;
        public static final com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType SI = null;
        public static final com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType SP = null;

        static {
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r0 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType
                java.lang.String r1 = "P"
                r2 = 0
                r0.<init>(r1, r2)
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.P = r0
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r1 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType
                java.lang.String r3 = "B"
                r4 = 1
                r1.<init>(r3, r4)
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.B = r1
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r3 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType
                java.lang.String r5 = "I"
                r6 = 2
                r3.<init>(r5, r6)
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.I = r3
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r5 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType
                java.lang.String r7 = "SP"
                r8 = 3
                r5.<init>(r7, r8)
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.SP = r5
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r7 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType
                java.lang.String r9 = "SI"
                r10 = 4
                r7.<init>(r9, r10)
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.SI = r7
                r9 = 5
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType[] r9 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.ENUM$VALUES = r9
                return
        }

        SliceType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType valueOf(java.lang.String r1) {
                java.lang.Class<com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType> r0 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r1 = (com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType) r1
                return r1
        }

        public static com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType[] values() {
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType[] r0 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.ENUM$VALUES
                int r1 = r0.length
                com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType[] r2 = new com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType[r1]
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                return r2
        }
    }

    public SliceHeader(java.io.InputStream r2, java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.SeqParameterSet> r3, java.util.Map<java.lang.Integer, com.googlecode.mp4parser.h264.model.PictureParameterSet> r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.field_pic_flag = r0
            r1.bottom_field_flag = r0
            r2.read()     // Catch: java.io.IOException -> Le3
            com.googlecode.mp4parser.h264.read.CAVLCReader r0 = new com.googlecode.mp4parser.h264.read.CAVLCReader     // Catch: java.io.IOException -> Le3
            r0.<init>(r2)     // Catch: java.io.IOException -> Le3
            java.lang.String r2 = "SliceHeader: first_mb_in_slice"
            int r2 = r0.readUE(r2)     // Catch: java.io.IOException -> Le3
            r1.first_mb_in_slice = r2     // Catch: java.io.IOException -> Le3
            java.lang.String r2 = "SliceHeader: slice_type"
            int r2 = r0.readUE(r2)     // Catch: java.io.IOException -> Le3
            switch(r2) {
                case 0: goto L36;
                case 1: goto L31;
                case 2: goto L2c;
                case 3: goto L27;
                case 4: goto L22;
                case 5: goto L36;
                case 6: goto L31;
                case 7: goto L2c;
                case 8: goto L27;
                case 9: goto L22;
                default: goto L21;
            }     // Catch: java.io.IOException -> Le3
        L21:
            goto L3a
        L22:
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r2 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.SI     // Catch: java.io.IOException -> Le3
            r1.slice_type = r2     // Catch: java.io.IOException -> Le3
            goto L3a
        L27:
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r2 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.SP     // Catch: java.io.IOException -> Le3
            r1.slice_type = r2     // Catch: java.io.IOException -> Le3
            goto L3a
        L2c:
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r2 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.I     // Catch: java.io.IOException -> Le3
            r1.slice_type = r2     // Catch: java.io.IOException -> Le3
            goto L3a
        L31:
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r2 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.B     // Catch: java.io.IOException -> Le3
            r1.slice_type = r2     // Catch: java.io.IOException -> Le3
            goto L3a
        L36:
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r2 = com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader.SliceType.P     // Catch: java.io.IOException -> Le3
            r1.slice_type = r2     // Catch: java.io.IOException -> Le3
        L3a:
            java.lang.String r2 = "SliceHeader: pic_parameter_set_id"
            int r2 = r0.readUE(r2)     // Catch: java.io.IOException -> Le3
            r1.pic_parameter_set_id = r2     // Catch: java.io.IOException -> Le3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.io.IOException -> Le3
            java.lang.Object r2 = r4.get(r2)     // Catch: java.io.IOException -> Le3
            com.googlecode.mp4parser.h264.model.PictureParameterSet r2 = (com.googlecode.mp4parser.h264.model.PictureParameterSet) r2     // Catch: java.io.IOException -> Le3
            r1.pps = r2     // Catch: java.io.IOException -> Le3
            int r2 = r2.seq_parameter_set_id     // Catch: java.io.IOException -> Le3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.io.IOException -> Le3
            java.lang.Object r2 = r3.get(r2)     // Catch: java.io.IOException -> Le3
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = (com.googlecode.mp4parser.h264.model.SeqParameterSet) r2     // Catch: java.io.IOException -> Le3
            r1.sps = r2     // Catch: java.io.IOException -> Le3
            boolean r2 = r2.residual_color_transform_flag     // Catch: java.io.IOException -> Le3
            if (r2 == 0) goto L69
            r2 = 2
            java.lang.String r3 = "SliceHeader: colour_plane_id"
            int r2 = r0.readU(r2, r3)     // Catch: java.io.IOException -> Le3
            r1.colour_plane_id = r2     // Catch: java.io.IOException -> Le3
        L69:
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r1.sps     // Catch: java.io.IOException -> Le3
            int r2 = r2.log2_max_frame_num_minus4     // Catch: java.io.IOException -> Le3
            int r2 = r2 + 4
            java.lang.String r3 = "SliceHeader: frame_num"
            int r2 = r0.readU(r2, r3)     // Catch: java.io.IOException -> Le3
            r1.frame_num = r2     // Catch: java.io.IOException -> Le3
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r1.sps     // Catch: java.io.IOException -> Le3
            boolean r2 = r2.frame_mbs_only_flag     // Catch: java.io.IOException -> Le3
            if (r2 != 0) goto L8f
            java.lang.String r2 = "SliceHeader: field_pic_flag"
            boolean r2 = r0.readBool(r2)     // Catch: java.io.IOException -> Le3
            r1.field_pic_flag = r2     // Catch: java.io.IOException -> Le3
            if (r2 == 0) goto L8f
            java.lang.String r2 = "SliceHeader: bottom_field_flag"
            boolean r2 = r0.readBool(r2)     // Catch: java.io.IOException -> Le3
            r1.bottom_field_flag = r2     // Catch: java.io.IOException -> Le3
        L8f:
            if (r5 == 0) goto L99
            java.lang.String r2 = "SliceHeader: idr_pic_id"
            int r2 = r0.readUE(r2)     // Catch: java.io.IOException -> Le3
            r1.idr_pic_id = r2     // Catch: java.io.IOException -> Le3
        L99:
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r1.sps     // Catch: java.io.IOException -> Le3
            int r3 = r2.pic_order_cnt_type     // Catch: java.io.IOException -> Le3
            if (r3 != 0) goto Lbd
            int r2 = r2.log2_max_pic_order_cnt_lsb_minus4     // Catch: java.io.IOException -> Le3
            int r2 = r2 + 4
            java.lang.String r3 = "SliceHeader: pic_order_cnt_lsb"
            int r2 = r0.readU(r2, r3)     // Catch: java.io.IOException -> Le3
            r1.pic_order_cnt_lsb = r2     // Catch: java.io.IOException -> Le3
            com.googlecode.mp4parser.h264.model.PictureParameterSet r2 = r1.pps     // Catch: java.io.IOException -> Le3
            boolean r2 = r2.bottom_field_pic_order_in_frame_present_flag     // Catch: java.io.IOException -> Le3
            if (r2 == 0) goto Lbd
            boolean r2 = r1.field_pic_flag     // Catch: java.io.IOException -> Le3
            if (r2 != 0) goto Lbd
            java.lang.String r2 = "SliceHeader: delta_pic_order_cnt_bottom"
            int r2 = r0.readSE(r2)     // Catch: java.io.IOException -> Le3
            r1.delta_pic_order_cnt_bottom = r2     // Catch: java.io.IOException -> Le3
        Lbd:
            com.googlecode.mp4parser.h264.model.SeqParameterSet r2 = r1.sps     // Catch: java.io.IOException -> Le3
            int r3 = r2.pic_order_cnt_type     // Catch: java.io.IOException -> Le3
            r4 = 1
            if (r3 != r4) goto Le2
            boolean r2 = r2.delta_pic_order_always_zero_flag     // Catch: java.io.IOException -> Le3
            if (r2 != 0) goto Le2
            java.lang.String r2 = "delta_pic_order_cnt_0"
            int r2 = r0.readSE(r2)     // Catch: java.io.IOException -> Le3
            r1.delta_pic_order_cnt_0 = r2     // Catch: java.io.IOException -> Le3
            com.googlecode.mp4parser.h264.model.PictureParameterSet r2 = r1.pps     // Catch: java.io.IOException -> Le3
            boolean r2 = r2.bottom_field_pic_order_in_frame_present_flag     // Catch: java.io.IOException -> Le3
            if (r2 == 0) goto Le2
            boolean r2 = r1.field_pic_flag     // Catch: java.io.IOException -> Le3
            if (r2 != 0) goto Le2
            java.lang.String r2 = "delta_pic_order_cnt_1"
            int r2 = r0.readSE(r2)     // Catch: java.io.IOException -> Le3
            r1.delta_pic_order_cnt_1 = r2     // Catch: java.io.IOException -> Le3
        Le2:
            return
        Le3:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SliceHeader{first_mb_in_slice="
            r0.<init>(r1)
            int r1 = r2.first_mb_in_slice
            r0.append(r1)
            java.lang.String r1 = ", slice_type="
            r0.append(r1)
            com.googlecode.mp4parser.authoring.tracks.h264.SliceHeader$SliceType r1 = r2.slice_type
            r0.append(r1)
            java.lang.String r1 = ", pic_parameter_set_id="
            r0.append(r1)
            int r1 = r2.pic_parameter_set_id
            r0.append(r1)
            java.lang.String r1 = ", colour_plane_id="
            r0.append(r1)
            int r1 = r2.colour_plane_id
            r0.append(r1)
            java.lang.String r1 = ", frame_num="
            r0.append(r1)
            int r1 = r2.frame_num
            r0.append(r1)
            java.lang.String r1 = ", field_pic_flag="
            r0.append(r1)
            boolean r1 = r2.field_pic_flag
            r0.append(r1)
            java.lang.String r1 = ", bottom_field_flag="
            r0.append(r1)
            boolean r1 = r2.bottom_field_flag
            r0.append(r1)
            java.lang.String r1 = ", idr_pic_id="
            r0.append(r1)
            int r1 = r2.idr_pic_id
            r0.append(r1)
            java.lang.String r1 = ", pic_order_cnt_lsb="
            r0.append(r1)
            int r1 = r2.pic_order_cnt_lsb
            r0.append(r1)
            java.lang.String r1 = ", delta_pic_order_cnt_bottom="
            r0.append(r1)
            int r1 = r2.delta_pic_order_cnt_bottom
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
