package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class PictureParameterSet extends com.googlecode.mp4parser.h264.model.BitstreamElement {
    public boolean bottom_field_pic_order_in_frame_present_flag;
    public int[] bottom_right;
    public int chroma_qp_index_offset;
    public boolean constrained_intra_pred_flag;
    public boolean deblocking_filter_control_present_flag;
    public boolean entropy_coding_mode_flag;
    public com.googlecode.mp4parser.h264.model.PictureParameterSet.PPSExt extended;
    public int num_ref_idx_l0_active_minus1;
    public int num_ref_idx_l1_active_minus1;
    public int num_slice_groups_minus1;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public int pic_parameter_set_id;
    public boolean redundant_pic_cnt_present_flag;
    public int[] run_length_minus1;
    public int seq_parameter_set_id;
    public boolean slice_group_change_direction_flag;
    public int slice_group_change_rate_minus1;
    public int[] slice_group_id;
    public int slice_group_map_type;
    public int[] top_left;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    public static class PPSExt {
        public boolean[] pic_scaling_list_present_flag;
        public com.googlecode.mp4parser.h264.model.ScalingMatrix scalindMatrix;
        public int second_chroma_qp_index_offset;
        public boolean transform_8x8_mode_flag;

        public PPSExt() {
                r1 = this;
                r1.<init>()
                com.googlecode.mp4parser.h264.model.ScalingMatrix r0 = new com.googlecode.mp4parser.h264.model.ScalingMatrix
                r0.<init>()
                r1.scalindMatrix = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PPSExt{transform_8x8_mode_flag="
                r0.<init>(r1)
                boolean r1 = r2.transform_8x8_mode_flag
                r0.append(r1)
                java.lang.String r1 = ", scalindMatrix="
                r0.append(r1)
                com.googlecode.mp4parser.h264.model.ScalingMatrix r1 = r2.scalindMatrix
                r0.append(r1)
                java.lang.String r1 = ", second_chroma_qp_index_offset="
                r0.append(r1)
                int r1 = r2.second_chroma_qp_index_offset
                r0.append(r1)
                java.lang.String r1 = ", pic_scaling_list_present_flag="
                r0.append(r1)
                boolean[] r1 = r2.pic_scaling_list_present_flag
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public PictureParameterSet() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.googlecode.mp4parser.h264.model.PictureParameterSet read(java.io.InputStream r10) throws java.io.IOException {
            com.googlecode.mp4parser.h264.read.CAVLCReader r0 = new com.googlecode.mp4parser.h264.read.CAVLCReader
            r0.<init>(r10)
            com.googlecode.mp4parser.h264.model.PictureParameterSet r10 = new com.googlecode.mp4parser.h264.model.PictureParameterSet
            r10.<init>()
            java.lang.String r1 = "PPS: pic_parameter_set_id"
            int r1 = r0.readUE(r1)
            r10.pic_parameter_set_id = r1
            java.lang.String r1 = "PPS: seq_parameter_set_id"
            int r1 = r0.readUE(r1)
            r10.seq_parameter_set_id = r1
            java.lang.String r1 = "PPS: entropy_coding_mode_flag"
            boolean r1 = r0.readBool(r1)
            r10.entropy_coding_mode_flag = r1
            java.lang.String r1 = "PPS: pic_order_present_flag"
            boolean r1 = r0.readBool(r1)
            r10.bottom_field_pic_order_in_frame_present_flag = r1
            java.lang.String r1 = "PPS: num_slice_groups_minus1"
            int r1 = r0.readUE(r1)
            r10.num_slice_groups_minus1 = r1
            r2 = 6
            r3 = 0
            r4 = 2
            if (r1 <= 0) goto Ldf
            java.lang.String r1 = "PPS: slice_group_map_type"
            int r1 = r0.readUE(r1)
            r10.slice_group_map_type = r1
            int r5 = r10.num_slice_groups_minus1
            int r6 = r5 + 1
            int[] r6 = new int[r6]
            r10.top_left = r6
            int r6 = r5 + 1
            int[] r6 = new int[r6]
            r10.bottom_right = r6
            int r6 = r5 + 1
            int[] r6 = new int[r6]
            r10.run_length_minus1 = r6
            if (r1 != 0) goto L69
            r1 = 0
        L56:
            int r5 = r10.num_slice_groups_minus1
            if (r1 <= r5) goto L5c
            goto Ldf
        L5c:
            int[] r5 = r10.run_length_minus1
            java.lang.String r6 = "PPS: run_length_minus1"
            int r6 = r0.readUE(r6)
            r5[r1] = r6
            int r1 = r1 + 1
            goto L56
        L69:
            if (r1 != r4) goto L89
            r1 = 0
        L6c:
            int r5 = r10.num_slice_groups_minus1
            if (r1 < r5) goto L72
            goto Ldf
        L72:
            int[] r5 = r10.top_left
            java.lang.String r6 = "PPS: top_left"
            int r6 = r0.readUE(r6)
            r5[r1] = r6
            int[] r5 = r10.bottom_right
            java.lang.String r6 = "PPS: bottom_right"
            int r6 = r0.readUE(r6)
            r5[r1] = r6
            int r1 = r1 + 1
            goto L6c
        L89:
            r6 = 3
            if (r1 == r6) goto Lcf
            r7 = 4
            if (r1 == r7) goto Lcf
            r8 = 5
            if (r1 != r8) goto L93
            goto Lcf
        L93:
            if (r1 != r2) goto Ldf
            int r1 = r5 + 1
            r8 = 1
            if (r1 <= r7) goto L9b
            goto La1
        L9b:
            int r5 = r5 + r8
            if (r5 <= r4) goto La0
            r6 = 2
            goto La1
        La0:
            r6 = 1
        La1:
            java.lang.String r1 = "PPS: pic_size_in_map_units_minus1"
            int r1 = r0.readUE(r1)
            int r5 = r1 + 1
            int[] r5 = new int[r5]
            r10.slice_group_id = r5
            r5 = 0
        Lae:
            if (r5 <= r1) goto Lb1
            goto Ldf
        Lb1:
            int[] r7 = r10.slice_group_id
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "PPS: slice_group_id ["
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r9 = "]f"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r8 = r0.readU(r6, r8)
            r7[r5] = r8
            int r5 = r5 + 1
            goto Lae
        Lcf:
            java.lang.String r1 = "PPS: slice_group_change_direction_flag"
            boolean r1 = r0.readBool(r1)
            r10.slice_group_change_direction_flag = r1
            java.lang.String r1 = "PPS: slice_group_change_rate_minus1"
            int r1 = r0.readUE(r1)
            r10.slice_group_change_rate_minus1 = r1
        Ldf:
            java.lang.String r1 = "PPS: num_ref_idx_l0_active_minus1"
            int r1 = r0.readUE(r1)
            r10.num_ref_idx_l0_active_minus1 = r1
            java.lang.String r1 = "PPS: num_ref_idx_l1_active_minus1"
            int r1 = r0.readUE(r1)
            r10.num_ref_idx_l1_active_minus1 = r1
            java.lang.String r1 = "PPS: weighted_pred_flag"
            boolean r1 = r0.readBool(r1)
            r10.weighted_pred_flag = r1
            java.lang.String r1 = "PPS: weighted_bipred_idc"
            long r5 = r0.readNBit(r4, r1)
            int r1 = (int) r5
            r10.weighted_bipred_idc = r1
            java.lang.String r1 = "PPS: pic_init_qp_minus26"
            int r1 = r0.readSE(r1)
            r10.pic_init_qp_minus26 = r1
            java.lang.String r1 = "PPS: pic_init_qs_minus26"
            int r1 = r0.readSE(r1)
            r10.pic_init_qs_minus26 = r1
            java.lang.String r1 = "PPS: chroma_qp_index_offset"
            int r1 = r0.readSE(r1)
            r10.chroma_qp_index_offset = r1
            java.lang.String r1 = "PPS: deblocking_filter_control_present_flag"
            boolean r1 = r0.readBool(r1)
            r10.deblocking_filter_control_present_flag = r1
            java.lang.String r1 = "PPS: constrained_intra_pred_flag"
            boolean r1 = r0.readBool(r1)
            r10.constrained_intra_pred_flag = r1
            java.lang.String r1 = "PPS: redundant_pic_cnt_present_flag"
            boolean r1 = r0.readBool(r1)
            r10.redundant_pic_cnt_present_flag = r1
            boolean r1 = r0.moreRBSPData()
            if (r1 == 0) goto L18f
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r1 = new com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt
            r1.<init>()
            r10.extended = r1
            java.lang.String r5 = "PPS: transform_8x8_mode_flag"
            boolean r5 = r0.readBool(r5)
            r1.transform_8x8_mode_flag = r5
            java.lang.String r1 = "PPS: pic_scaling_matrix_present_flag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto L185
        L14d:
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r1 = r10.extended
            boolean r1 = r1.transform_8x8_mode_flag
            int r1 = r1 * 2
            int r1 = r1 + r2
            if (r3 < r1) goto L157
            goto L185
        L157:
            java.lang.String r1 = "PPS: pic_scaling_list_present_flag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto L182
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r1 = r10.extended
            com.googlecode.mp4parser.h264.model.ScalingMatrix r1 = r1.scalindMatrix
            r5 = 8
            com.googlecode.mp4parser.h264.model.ScalingList[] r6 = new com.googlecode.mp4parser.h264.model.ScalingList[r5]
            r1.ScalingList4x4 = r6
            com.googlecode.mp4parser.h264.model.ScalingList[] r5 = new com.googlecode.mp4parser.h264.model.ScalingList[r5]
            r1.ScalingList8x8 = r5
            if (r3 >= r2) goto L178
            r1 = 16
            com.googlecode.mp4parser.h264.model.ScalingList r1 = com.googlecode.mp4parser.h264.model.ScalingList.read(r0, r1)
            r6[r3] = r1
            goto L182
        L178:
            int r1 = r3 + (-6)
            r6 = 64
            com.googlecode.mp4parser.h264.model.ScalingList r6 = com.googlecode.mp4parser.h264.model.ScalingList.read(r0, r6)
            r5[r1] = r6
        L182:
            int r3 = r3 + 1
            goto L14d
        L185:
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r1 = r10.extended
            java.lang.String r2 = "PPS: second_chroma_qp_index_offset"
            int r2 = r0.readSE(r2)
            r1.second_chroma_qp_index_offset = r2
        L18f:
            r0.readTrailingBits()
            return r10
    }

    public static com.googlecode.mp4parser.h264.model.PictureParameterSet read(byte[] r1) throws java.io.IOException {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            com.googlecode.mp4parser.h264.model.PictureParameterSet r1 = read(r0)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.googlecode.mp4parser.h264.model.PictureParameterSet r5 = (com.googlecode.mp4parser.h264.model.PictureParameterSet) r5
            int[] r2 = r4.bottom_right
            int[] r3 = r5.bottom_right
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            int r2 = r4.chroma_qp_index_offset
            int r3 = r5.chroma_qp_index_offset
            if (r2 == r3) goto L27
            return r1
        L27:
            boolean r2 = r4.constrained_intra_pred_flag
            boolean r3 = r5.constrained_intra_pred_flag
            if (r2 == r3) goto L2e
            return r1
        L2e:
            boolean r2 = r4.deblocking_filter_control_present_flag
            boolean r3 = r5.deblocking_filter_control_present_flag
            if (r2 == r3) goto L35
            return r1
        L35:
            boolean r2 = r4.entropy_coding_mode_flag
            boolean r3 = r5.entropy_coding_mode_flag
            if (r2 == r3) goto L3c
            return r1
        L3c:
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r2 = r4.extended
            if (r2 != 0) goto L45
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r2 = r5.extended
            if (r2 == 0) goto L4e
            return r1
        L45:
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r3 = r5.extended
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4e
            return r1
        L4e:
            int r2 = r4.num_ref_idx_l0_active_minus1
            int r3 = r5.num_ref_idx_l0_active_minus1
            if (r2 == r3) goto L55
            return r1
        L55:
            int r2 = r4.num_ref_idx_l1_active_minus1
            int r3 = r5.num_ref_idx_l1_active_minus1
            if (r2 == r3) goto L5c
            return r1
        L5c:
            int r2 = r4.num_slice_groups_minus1
            int r3 = r5.num_slice_groups_minus1
            if (r2 == r3) goto L63
            return r1
        L63:
            int r2 = r4.pic_init_qp_minus26
            int r3 = r5.pic_init_qp_minus26
            if (r2 == r3) goto L6a
            return r1
        L6a:
            int r2 = r4.pic_init_qs_minus26
            int r3 = r5.pic_init_qs_minus26
            if (r2 == r3) goto L71
            return r1
        L71:
            boolean r2 = r4.bottom_field_pic_order_in_frame_present_flag
            boolean r3 = r5.bottom_field_pic_order_in_frame_present_flag
            if (r2 == r3) goto L78
            return r1
        L78:
            int r2 = r4.pic_parameter_set_id
            int r3 = r5.pic_parameter_set_id
            if (r2 == r3) goto L7f
            return r1
        L7f:
            boolean r2 = r4.redundant_pic_cnt_present_flag
            boolean r3 = r5.redundant_pic_cnt_present_flag
            if (r2 == r3) goto L86
            return r1
        L86:
            int[] r2 = r4.run_length_minus1
            int[] r3 = r5.run_length_minus1
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L91
            return r1
        L91:
            int r2 = r4.seq_parameter_set_id
            int r3 = r5.seq_parameter_set_id
            if (r2 == r3) goto L98
            return r1
        L98:
            boolean r2 = r4.slice_group_change_direction_flag
            boolean r3 = r5.slice_group_change_direction_flag
            if (r2 == r3) goto L9f
            return r1
        L9f:
            int r2 = r4.slice_group_change_rate_minus1
            int r3 = r5.slice_group_change_rate_minus1
            if (r2 == r3) goto La6
            return r1
        La6:
            int[] r2 = r4.slice_group_id
            int[] r3 = r5.slice_group_id
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto Lb1
            return r1
        Lb1:
            int r2 = r4.slice_group_map_type
            int r3 = r5.slice_group_map_type
            if (r2 == r3) goto Lb8
            return r1
        Lb8:
            int[] r2 = r4.top_left
            int[] r3 = r5.top_left
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto Lc3
            return r1
        Lc3:
            int r2 = r4.weighted_bipred_idc
            int r3 = r5.weighted_bipred_idc
            if (r2 == r3) goto Lca
            return r1
        Lca:
            boolean r2 = r4.weighted_pred_flag
            boolean r5 = r5.weighted_pred_flag
            if (r2 == r5) goto Ld1
            return r1
        Ld1:
            return r0
    }

    public int hashCode() {
            r5 = this;
            int[] r0 = r5.bottom_right
            int r0 = java.util.Arrays.hashCode(r0)
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r5.chroma_qp_index_offset
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r5.constrained_intra_pred_flag
            r3 = 1231(0x4cf, float:1.725E-42)
            r4 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L1b
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L1d
        L1b:
            r2 = 1237(0x4d5, float:1.733E-42)
        L1d:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r5.deblocking_filter_control_present_flag
            if (r2 == 0) goto L27
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L29
        L27:
            r2 = 1237(0x4d5, float:1.733E-42)
        L29:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r5.entropy_coding_mode_flag
            if (r2 == 0) goto L33
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L35
        L33:
            r2 = 1237(0x4d5, float:1.733E-42)
        L35:
            int r0 = r0 + r2
            int r0 = r0 * 31
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r2 = r5.extended
            if (r2 != 0) goto L3e
            r2 = 0
            goto L42
        L3e:
            int r2 = r2.hashCode()
        L42:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.num_ref_idx_l0_active_minus1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.num_ref_idx_l1_active_minus1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.num_slice_groups_minus1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.pic_init_qp_minus26
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.pic_init_qs_minus26
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r5.bottom_field_pic_order_in_frame_present_flag
            if (r2 == 0) goto L65
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L67
        L65:
            r2 = 1237(0x4d5, float:1.733E-42)
        L67:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.pic_parameter_set_id
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r5.redundant_pic_cnt_present_flag
            if (r2 == 0) goto L76
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L78
        L76:
            r2 = 1237(0x4d5, float:1.733E-42)
        L78:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int[] r2 = r5.run_length_minus1
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.seq_parameter_set_id
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r5.slice_group_change_direction_flag
            if (r2 == 0) goto L90
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L92
        L90:
            r2 = 1237(0x4d5, float:1.733E-42)
        L92:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.slice_group_change_rate_minus1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int[] r2 = r5.slice_group_id
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.slice_group_map_type
            int r0 = r0 + r2
            int r0 = r0 * 31
            int[] r2 = r5.top_left
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r5.weighted_bipred_idc
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r5.weighted_pred_flag
            if (r1 == 0) goto Lbb
            goto Lbd
        Lbb:
            r3 = 1237(0x4d5, float:1.733E-42)
        Lbd:
            int r0 = r0 + r3
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PictureParameterSet{\n       entropy_coding_mode_flag="
            r0.<init>(r1)
            boolean r1 = r2.entropy_coding_mode_flag
            r0.append(r1)
            java.lang.String r1 = ",\n       num_ref_idx_l0_active_minus1="
            r0.append(r1)
            int r1 = r2.num_ref_idx_l0_active_minus1
            r0.append(r1)
            java.lang.String r1 = ",\n       num_ref_idx_l1_active_minus1="
            r0.append(r1)
            int r1 = r2.num_ref_idx_l1_active_minus1
            r0.append(r1)
            java.lang.String r1 = ",\n       slice_group_change_rate_minus1="
            r0.append(r1)
            int r1 = r2.slice_group_change_rate_minus1
            r0.append(r1)
            java.lang.String r1 = ",\n       pic_parameter_set_id="
            r0.append(r1)
            int r1 = r2.pic_parameter_set_id
            r0.append(r1)
            java.lang.String r1 = ",\n       seq_parameter_set_id="
            r0.append(r1)
            int r1 = r2.seq_parameter_set_id
            r0.append(r1)
            java.lang.String r1 = ",\n       pic_order_present_flag="
            r0.append(r1)
            boolean r1 = r2.bottom_field_pic_order_in_frame_present_flag
            r0.append(r1)
            java.lang.String r1 = ",\n       num_slice_groups_minus1="
            r0.append(r1)
            int r1 = r2.num_slice_groups_minus1
            r0.append(r1)
            java.lang.String r1 = ",\n       slice_group_map_type="
            r0.append(r1)
            int r1 = r2.slice_group_map_type
            r0.append(r1)
            java.lang.String r1 = ",\n       weighted_pred_flag="
            r0.append(r1)
            boolean r1 = r2.weighted_pred_flag
            r0.append(r1)
            java.lang.String r1 = ",\n       weighted_bipred_idc="
            r0.append(r1)
            int r1 = r2.weighted_bipred_idc
            r0.append(r1)
            java.lang.String r1 = ",\n       pic_init_qp_minus26="
            r0.append(r1)
            int r1 = r2.pic_init_qp_minus26
            r0.append(r1)
            java.lang.String r1 = ",\n       pic_init_qs_minus26="
            r0.append(r1)
            int r1 = r2.pic_init_qs_minus26
            r0.append(r1)
            java.lang.String r1 = ",\n       chroma_qp_index_offset="
            r0.append(r1)
            int r1 = r2.chroma_qp_index_offset
            r0.append(r1)
            java.lang.String r1 = ",\n       deblocking_filter_control_present_flag="
            r0.append(r1)
            boolean r1 = r2.deblocking_filter_control_present_flag
            r0.append(r1)
            java.lang.String r1 = ",\n       constrained_intra_pred_flag="
            r0.append(r1)
            boolean r1 = r2.constrained_intra_pred_flag
            r0.append(r1)
            java.lang.String r1 = ",\n       redundant_pic_cnt_present_flag="
            r0.append(r1)
            boolean r1 = r2.redundant_pic_cnt_present_flag
            r0.append(r1)
            java.lang.String r1 = ",\n       top_left="
            r0.append(r1)
            int[] r1 = r2.top_left
            r0.append(r1)
            java.lang.String r1 = ",\n       bottom_right="
            r0.append(r1)
            int[] r1 = r2.bottom_right
            r0.append(r1)
            java.lang.String r1 = ",\n       run_length_minus1="
            r0.append(r1)
            int[] r1 = r2.run_length_minus1
            r0.append(r1)
            java.lang.String r1 = ",\n       slice_group_change_direction_flag="
            r0.append(r1)
            boolean r1 = r2.slice_group_change_direction_flag
            r0.append(r1)
            java.lang.String r1 = ",\n       slice_group_id="
            r0.append(r1)
            int[] r1 = r2.slice_group_id
            r0.append(r1)
            java.lang.String r1 = ",\n       extended="
            r0.append(r1)
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r1 = r2.extended
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.h264.model.BitstreamElement
    public void write(java.io.OutputStream r10) throws java.io.IOException {
            r9 = this;
            com.googlecode.mp4parser.h264.write.CAVLCWriter r0 = new com.googlecode.mp4parser.h264.write.CAVLCWriter
            r0.<init>(r10)
            int r10 = r9.pic_parameter_set_id
            java.lang.String r1 = "PPS: pic_parameter_set_id"
            r0.writeUE(r10, r1)
            int r10 = r9.seq_parameter_set_id
            java.lang.String r1 = "PPS: seq_parameter_set_id"
            r0.writeUE(r10, r1)
            boolean r10 = r9.entropy_coding_mode_flag
            java.lang.String r1 = "PPS: entropy_coding_mode_flag"
            r0.writeBool(r10, r1)
            boolean r10 = r9.bottom_field_pic_order_in_frame_present_flag
            java.lang.String r1 = "PPS: pic_order_present_flag"
            r0.writeBool(r10, r1)
            int r10 = r9.num_slice_groups_minus1
            java.lang.String r1 = "PPS: num_slice_groups_minus1"
            r0.writeUE(r10, r1)
            int r10 = r9.num_slice_groups_minus1
            r1 = 6
            r2 = 2
            java.lang.String r3 = "PPS: "
            r4 = 0
            r5 = 1
            if (r10 <= 0) goto La2
            int r10 = r9.slice_group_map_type
            java.lang.String r6 = "PPS: slice_group_map_type"
            r0.writeUE(r10, r6)
            int[] r10 = new int[r5]
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            int r8 = r9.slice_group_map_type
            if (r8 != 0) goto L51
            r10 = 0
        L44:
            int r6 = r9.num_slice_groups_minus1
            if (r10 <= r6) goto L49
            goto La2
        L49:
            r6 = r7[r10]
            r0.writeUE(r6, r3)
            int r10 = r10 + 1
            goto L44
        L51:
            if (r8 != r2) goto L66
            r7 = 0
        L54:
            int r8 = r9.num_slice_groups_minus1
            if (r7 < r8) goto L59
            goto La2
        L59:
            r8 = r10[r7]
            r0.writeUE(r8, r3)
            r8 = r6[r7]
            r0.writeUE(r8, r3)
            int r7 = r7 + 1
            goto L54
        L66:
            r10 = 3
            if (r8 == r10) goto L94
            r6 = 4
            if (r8 == r6) goto L94
            r7 = 5
            if (r8 != r7) goto L70
            goto L94
        L70:
            if (r8 != r1) goto La2
            int r7 = r9.num_slice_groups_minus1
            int r8 = r7 + 1
            if (r8 <= r6) goto L79
            goto L7f
        L79:
            int r7 = r7 + r5
            if (r7 <= r2) goto L7e
            r10 = 2
            goto L7f
        L7e:
            r10 = 1
        L7f:
            int[] r6 = r9.slice_group_id
            int r6 = r6.length
            r0.writeUE(r6, r3)
            r6 = 0
        L86:
            int[] r7 = r9.slice_group_id
            int r8 = r7.length
            if (r6 <= r8) goto L8c
            goto La2
        L8c:
            r7 = r7[r6]
            r0.writeU(r7, r10)
            int r6 = r6 + 1
            goto L86
        L94:
            boolean r10 = r9.slice_group_change_direction_flag
            java.lang.String r6 = "PPS: slice_group_change_direction_flag"
            r0.writeBool(r10, r6)
            int r10 = r9.slice_group_change_rate_minus1
            java.lang.String r6 = "PPS: slice_group_change_rate_minus1"
            r0.writeUE(r10, r6)
        La2:
            int r10 = r9.num_ref_idx_l0_active_minus1
            java.lang.String r6 = "PPS: num_ref_idx_l0_active_minus1"
            r0.writeUE(r10, r6)
            int r10 = r9.num_ref_idx_l1_active_minus1
            java.lang.String r6 = "PPS: num_ref_idx_l1_active_minus1"
            r0.writeUE(r10, r6)
            boolean r10 = r9.weighted_pred_flag
            java.lang.String r6 = "PPS: weighted_pred_flag"
            r0.writeBool(r10, r6)
            int r10 = r9.weighted_bipred_idc
            long r6 = (long) r10
            java.lang.String r10 = "PPS: weighted_bipred_idc"
            r0.writeNBit(r6, r2, r10)
            int r10 = r9.pic_init_qp_minus26
            java.lang.String r6 = "PPS: pic_init_qp_minus26"
            r0.writeSE(r10, r6)
            int r10 = r9.pic_init_qs_minus26
            java.lang.String r6 = "PPS: pic_init_qs_minus26"
            r0.writeSE(r10, r6)
            int r10 = r9.chroma_qp_index_offset
            java.lang.String r6 = "PPS: chroma_qp_index_offset"
            r0.writeSE(r10, r6)
            boolean r10 = r9.deblocking_filter_control_present_flag
            java.lang.String r6 = "PPS: deblocking_filter_control_present_flag"
            r0.writeBool(r10, r6)
            boolean r10 = r9.constrained_intra_pred_flag
            java.lang.String r6 = "PPS: constrained_intra_pred_flag"
            r0.writeBool(r10, r6)
            boolean r10 = r9.redundant_pic_cnt_present_flag
            java.lang.String r6 = "PPS: redundant_pic_cnt_present_flag"
            r0.writeBool(r10, r6)
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r10 = r9.extended
            if (r10 == 0) goto L15c
            boolean r10 = r10.transform_8x8_mode_flag
            java.lang.String r6 = "PPS: transform_8x8_mode_flag"
            r0.writeBool(r10, r6)
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r10 = r9.extended
            com.googlecode.mp4parser.h264.model.ScalingMatrix r10 = r10.scalindMatrix
            if (r10 == 0) goto Lfc
            r10 = 1
            goto Lfd
        Lfc:
            r10 = 0
        Lfd:
            java.lang.String r6 = "PPS: scalindMatrix"
            r0.writeBool(r10, r6)
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r10 = r9.extended
            com.googlecode.mp4parser.h264.model.ScalingMatrix r10 = r10.scalindMatrix
            if (r10 == 0) goto L155
            r10 = 0
        L109:
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r6 = r9.extended
            boolean r7 = r6.transform_8x8_mode_flag
            int r7 = r7 * 2
            int r7 = r7 + r1
            if (r10 < r7) goto L113
            goto L155
        L113:
            if (r10 >= r1) goto L133
            com.googlecode.mp4parser.h264.model.ScalingMatrix r6 = r6.scalindMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r6 = r6.ScalingList4x4
            r6 = r6[r10]
            if (r6 == 0) goto L11f
            r6 = 1
            goto L120
        L11f:
            r6 = 0
        L120:
            r0.writeBool(r6, r3)
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r6 = r9.extended
            com.googlecode.mp4parser.h264.model.ScalingMatrix r6 = r6.scalindMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r6 = r6.ScalingList4x4
            r7 = r6[r10]
            if (r7 == 0) goto L152
            r6 = r6[r10]
            r6.write(r0)
            goto L152
        L133:
            com.googlecode.mp4parser.h264.model.ScalingMatrix r6 = r6.scalindMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r6 = r6.ScalingList8x8
            int r7 = r10 + (-6)
            r6 = r6[r7]
            if (r6 == 0) goto L13f
            r6 = 1
            goto L140
        L13f:
            r6 = 0
        L140:
            r0.writeBool(r6, r3)
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r6 = r9.extended
            com.googlecode.mp4parser.h264.model.ScalingMatrix r6 = r6.scalindMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r6 = r6.ScalingList8x8
            r8 = r6[r7]
            if (r8 == 0) goto L152
            r6 = r6[r7]
            r6.write(r0)
        L152:
            int r10 = r10 + 1
            goto L109
        L155:
            com.googlecode.mp4parser.h264.model.PictureParameterSet$PPSExt r10 = r9.extended
            int r10 = r10.second_chroma_qp_index_offset
            r0.writeSE(r10, r3)
        L15c:
            r0.writeTrailingBits()
            return
    }
}
