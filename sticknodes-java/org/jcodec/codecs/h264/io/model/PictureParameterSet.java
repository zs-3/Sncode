package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public class PictureParameterSet {
    public int[] bottom_right;
    public int chroma_qp_index_offset;
    public boolean constrained_intra_pred_flag;
    public boolean deblocking_filter_control_present_flag;
    public boolean entropy_coding_mode_flag;
    public int[] num_ref_idx_active_minus1;
    public int num_slice_groups_minus1;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public boolean pic_order_present_flag;
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

    public PictureParameterSet() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.num_ref_idx_active_minus1 = r0
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            org.jcodec.codecs.h264.io.model.PictureParameterSet r7 = (org.jcodec.codecs.h264.io.model.PictureParameterSet) r7
            int[] r2 = r6.bottom_right
            int[] r3 = r7.bottom_right
            boolean r2 = org.jcodec.platform.Platform.arrayEqualsInt(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            int r2 = r6.chroma_qp_index_offset
            int r3 = r7.chroma_qp_index_offset
            if (r2 == r3) goto L27
            return r1
        L27:
            boolean r2 = r6.constrained_intra_pred_flag
            boolean r3 = r7.constrained_intra_pred_flag
            if (r2 == r3) goto L2e
            return r1
        L2e:
            boolean r2 = r6.deblocking_filter_control_present_flag
            boolean r3 = r7.deblocking_filter_control_present_flag
            if (r2 == r3) goto L35
            return r1
        L35:
            boolean r2 = r6.entropy_coding_mode_flag
            boolean r3 = r7.entropy_coding_mode_flag
            if (r2 == r3) goto L3c
            return r1
        L3c:
            int[] r2 = r6.num_ref_idx_active_minus1
            r3 = r2[r1]
            int[] r4 = r7.num_ref_idx_active_minus1
            r5 = r4[r1]
            if (r3 == r5) goto L47
            return r1
        L47:
            r2 = r2[r0]
            r3 = r4[r0]
            if (r2 == r3) goto L4e
            return r1
        L4e:
            int r2 = r6.num_slice_groups_minus1
            int r3 = r7.num_slice_groups_minus1
            if (r2 == r3) goto L55
            return r1
        L55:
            int r2 = r6.pic_init_qp_minus26
            int r3 = r7.pic_init_qp_minus26
            if (r2 == r3) goto L5c
            return r1
        L5c:
            int r2 = r6.pic_init_qs_minus26
            int r3 = r7.pic_init_qs_minus26
            if (r2 == r3) goto L63
            return r1
        L63:
            boolean r2 = r6.pic_order_present_flag
            boolean r3 = r7.pic_order_present_flag
            if (r2 == r3) goto L6a
            return r1
        L6a:
            int r2 = r6.pic_parameter_set_id
            int r3 = r7.pic_parameter_set_id
            if (r2 == r3) goto L71
            return r1
        L71:
            boolean r2 = r6.redundant_pic_cnt_present_flag
            boolean r3 = r7.redundant_pic_cnt_present_flag
            if (r2 == r3) goto L78
            return r1
        L78:
            int[] r2 = r6.run_length_minus1
            int[] r3 = r7.run_length_minus1
            boolean r2 = org.jcodec.platform.Platform.arrayEqualsInt(r2, r3)
            if (r2 != 0) goto L83
            return r1
        L83:
            int r2 = r6.seq_parameter_set_id
            int r3 = r7.seq_parameter_set_id
            if (r2 == r3) goto L8a
            return r1
        L8a:
            boolean r2 = r6.slice_group_change_direction_flag
            boolean r3 = r7.slice_group_change_direction_flag
            if (r2 == r3) goto L91
            return r1
        L91:
            int r2 = r6.slice_group_change_rate_minus1
            int r3 = r7.slice_group_change_rate_minus1
            if (r2 == r3) goto L98
            return r1
        L98:
            int[] r2 = r6.slice_group_id
            int[] r3 = r7.slice_group_id
            boolean r2 = org.jcodec.platform.Platform.arrayEqualsInt(r2, r3)
            if (r2 != 0) goto La3
            return r1
        La3:
            int r2 = r6.slice_group_map_type
            int r3 = r7.slice_group_map_type
            if (r2 == r3) goto Laa
            return r1
        Laa:
            int[] r2 = r6.top_left
            int[] r3 = r7.top_left
            boolean r2 = org.jcodec.platform.Platform.arrayEqualsInt(r2, r3)
            if (r2 != 0) goto Lb5
            return r1
        Lb5:
            int r2 = r6.weighted_bipred_idc
            int r3 = r7.weighted_bipred_idc
            if (r2 == r3) goto Lbc
            return r1
        Lbc:
            boolean r2 = r6.weighted_pred_flag
            boolean r7 = r7.weighted_pred_flag
            if (r2 == r7) goto Lc3
            return r1
        Lc3:
            return r0
    }

    public int hashCode() {
            r6 = this;
            int[] r0 = r6.bottom_right
            int r0 = java.util.Arrays.hashCode(r0)
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r6.chroma_qp_index_offset
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r6.constrained_intra_pred_flag
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
            boolean r2 = r6.deblocking_filter_control_present_flag
            if (r2 == 0) goto L27
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L29
        L27:
            r2 = 1237(0x4d5, float:1.733E-42)
        L29:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r6.entropy_coding_mode_flag
            if (r2 == 0) goto L33
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L35
        L33:
            r2 = 1237(0x4d5, float:1.733E-42)
        L35:
            int r0 = r0 + r2
            int r0 = r0 * 31
            r2 = 0
            int r0 = r0 + r2
            int r0 = r0 * 31
            int[] r5 = r6.num_ref_idx_active_minus1
            r2 = r5[r2]
            int r0 = r0 + r2
            int r0 = r0 * 31
            r2 = 1
            r2 = r5[r2]
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.num_slice_groups_minus1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.pic_init_qp_minus26
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.pic_init_qs_minus26
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r6.pic_order_present_flag
            if (r2 == 0) goto L5f
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L61
        L5f:
            r2 = 1237(0x4d5, float:1.733E-42)
        L61:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.pic_parameter_set_id
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r6.redundant_pic_cnt_present_flag
            if (r2 == 0) goto L70
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L72
        L70:
            r2 = 1237(0x4d5, float:1.733E-42)
        L72:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int[] r2 = r6.run_length_minus1
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.seq_parameter_set_id
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r6.slice_group_change_direction_flag
            if (r2 == 0) goto L8a
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L8c
        L8a:
            r2 = 1237(0x4d5, float:1.733E-42)
        L8c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.slice_group_change_rate_minus1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int[] r2 = r6.slice_group_id
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.slice_group_map_type
            int r0 = r0 + r2
            int r0 = r0 * 31
            int[] r2 = r6.top_left
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r6.weighted_bipred_idc
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r6.weighted_pred_flag
            if (r1 == 0) goto Lb5
            goto Lb7
        Lb5:
            r3 = 1237(0x4d5, float:1.733E-42)
        Lb7:
            int r0 = r0 + r3
            return r0
    }

    public void write(java.nio.ByteBuffer r9) {
            r8 = this;
            org.jcodec.common.io.BitWriter r0 = new org.jcodec.common.io.BitWriter
            r0.<init>(r9)
            int r9 = r8.pic_parameter_set_id
            java.lang.String r1 = "PPS: pic_parameter_set_id"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.seq_parameter_set_id
            java.lang.String r1 = "PPS: seq_parameter_set_id"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            boolean r9 = r8.entropy_coding_mode_flag
            java.lang.String r1 = "PPS: entropy_coding_mode_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            boolean r9 = r8.pic_order_present_flag
            java.lang.String r1 = "PPS: pic_order_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            int r9 = r8.num_slice_groups_minus1
            java.lang.String r1 = "PPS: num_slice_groups_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.num_slice_groups_minus1
            r1 = 2
            r2 = 0
            r3 = 1
            if (r9 <= 0) goto L9f
            int r9 = r8.slice_group_map_type
            java.lang.String r4 = "PPS: slice_group_map_type"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r4)
            int[] r9 = new int[r3]
            int[] r4 = new int[r3]
            int[] r5 = new int[r3]
            int r6 = r8.slice_group_map_type
            java.lang.String r7 = "PPS: "
            if (r6 != 0) goto L4f
            r9 = 0
        L43:
            int r4 = r8.num_slice_groups_minus1
            if (r9 > r4) goto L9f
            r4 = r5[r9]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r4, r7)
            int r9 = r9 + 1
            goto L43
        L4f:
            if (r6 != r1) goto L63
            r5 = 0
        L52:
            int r6 = r8.num_slice_groups_minus1
            if (r5 >= r6) goto L9f
            r6 = r9[r5]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r6, r7)
            r6 = r4[r5]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r6, r7)
            int r5 = r5 + 1
            goto L52
        L63:
            r9 = 3
            if (r6 == r9) goto L91
            r4 = 4
            if (r6 == r4) goto L91
            r5 = 5
            if (r6 != r5) goto L6d
            goto L91
        L6d:
            r5 = 6
            if (r6 != r5) goto L9f
            int r5 = r8.num_slice_groups_minus1
            int r6 = r5 + 1
            if (r6 <= r4) goto L77
            goto L7d
        L77:
            int r5 = r5 + r3
            if (r5 <= r1) goto L7c
            r9 = 2
            goto L7d
        L7c:
            r9 = 1
        L7d:
            int[] r4 = r8.slice_group_id
            int r4 = r4.length
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r4, r7)
            r4 = 0
        L84:
            int[] r5 = r8.slice_group_id
            int r6 = r5.length
            if (r4 > r6) goto L9f
            r5 = r5[r4]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeU(r0, r5, r9)
            int r4 = r4 + 1
            goto L84
        L91:
            boolean r9 = r8.slice_group_change_direction_flag
            java.lang.String r4 = "PPS: slice_group_change_direction_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r4)
            int r9 = r8.slice_group_change_rate_minus1
            java.lang.String r4 = "PPS: slice_group_change_rate_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r4)
        L9f:
            int[] r9 = r8.num_ref_idx_active_minus1
            r9 = r9[r2]
            java.lang.String r2 = "PPS: num_ref_idx_l0_active_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r2)
            int[] r9 = r8.num_ref_idx_active_minus1
            r9 = r9[r3]
            java.lang.String r2 = "PPS: num_ref_idx_l1_active_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r2)
            boolean r9 = r8.weighted_pred_flag
            java.lang.String r2 = "PPS: weighted_pred_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r2)
            int r9 = r8.weighted_bipred_idc
            long r2 = (long) r9
            java.lang.String r9 = "PPS: weighted_bipred_idc"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r0, r2, r1, r9)
            int r9 = r8.pic_init_qp_minus26
            java.lang.String r1 = "PPS: pic_init_qp_minus26"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r0, r9, r1)
            int r9 = r8.pic_init_qs_minus26
            java.lang.String r1 = "PPS: pic_init_qs_minus26"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r0, r9, r1)
            int r9 = r8.chroma_qp_index_offset
            java.lang.String r1 = "PPS: chroma_qp_index_offset"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r0, r9, r1)
            boolean r9 = r8.deblocking_filter_control_present_flag
            java.lang.String r1 = "PPS: deblocking_filter_control_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            boolean r9 = r8.constrained_intra_pred_flag
            java.lang.String r1 = "PPS: constrained_intra_pred_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            boolean r9 = r8.redundant_pic_cnt_present_flag
            java.lang.String r1 = "PPS: redundant_pic_cnt_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeTrailingBits(r0)
            return
    }
}
