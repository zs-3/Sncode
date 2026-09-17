package org.jcodec.codecs.h264.io.write;

/* loaded from: classes2.dex */
public class SliceHeaderWriter {
    public SliceHeaderWriter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int CeilLog2(int r1) {
            int r1 = r1 + (-1)
            r0 = 0
        L3:
            if (r1 == 0) goto La
            int r1 = r1 >> 1
            int r0 = r0 + 1
            goto L3
        La:
            return r0
    }

    private void writeDecRefPicMarking(org.jcodec.codecs.h264.io.model.SliceHeader r2, boolean r3, org.jcodec.common.io.BitWriter r4) {
            r1 = this;
            if (r3 == 0) goto L17
            org.jcodec.codecs.h264.io.model.RefPicMarkingIDR r2 = r2.refPicMarkingIDR
            boolean r3 = r2.isDiscardDecodedPics()
            java.lang.String r0 = "SH: no_output_of_prior_pics_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r4, r3, r0)
            boolean r2 = r2.isUseForlongTerm()
            java.lang.String r3 = "SH: long_term_reference_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r4, r2, r3)
            goto L20
        L17:
            java.util.Objects.requireNonNull(r2)
            r2 = 0
            java.lang.String r3 = "SH: adaptive_ref_pic_marking_mode_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r4, r2, r3)
        L20:
            return
    }

    private void writePredWeightTable(org.jcodec.codecs.h264.io.model.SliceHeader r1, org.jcodec.common.io.BitWriter r2) {
            r0 = this;
            org.jcodec.codecs.h264.io.model.SeqParameterSet r1 = r1.sps
            r1 = 0
            throw r1
    }

    private void writeRefPicListReordering(org.jcodec.codecs.h264.io.model.SliceHeader r5, org.jcodec.common.io.BitWriter r6) {
            r4 = this;
            org.jcodec.codecs.h264.io.model.SliceType r0 = r5.slice_type
            boolean r0 = r0.isInter()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            int[][][] r0 = r5.refPicReordering
            if (r0 == 0) goto L14
            r0 = r0[r2]
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            java.lang.String r3 = "SH: ref_pic_list_reordering_flag_l0"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r6, r0, r3)
            if (r0 == 0) goto L23
            int[][][] r0 = r5.refPicReordering
            r0 = r0[r2]
            r4.writeReorderingList(r0, r6)
        L23:
            org.jcodec.codecs.h264.io.model.SliceType r0 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r3 = org.jcodec.codecs.h264.io.model.SliceType.B
            if (r0 != r3) goto L40
            int[][][] r0 = r5.refPicReordering
            if (r0 == 0) goto L32
            r0 = r0[r1]
            if (r0 == 0) goto L32
            r2 = 1
        L32:
            java.lang.String r0 = "SH: ref_pic_list_reordering_flag_l1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r6, r2, r0)
            if (r2 == 0) goto L40
            int[][][] r5 = r5.refPicReordering
            r5 = r5[r1]
            r4.writeReorderingList(r5, r6)
        L40:
            return
    }

    private void writeReorderingList(int[][] r5, org.jcodec.common.io.BitWriter r6) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r0 = 0
            r1 = 0
        L5:
            r2 = r5[r0]
            int r2 = r2.length
            java.lang.String r3 = "SH: reordering_of_pic_nums_idc"
            if (r1 >= r2) goto L20
            r2 = r5[r0]
            r2 = r2[r1]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r6, r2, r3)
            r2 = 1
            r2 = r5[r2]
            r2 = r2[r1]
            java.lang.String r3 = "SH: abs_diff_pic_num_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r6, r2, r3)
            int r1 = r1 + 1
            goto L5
        L20:
            r5 = 3
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r6, r5, r3)
            return
    }

    public void write(org.jcodec.codecs.h264.io.model.SliceHeader r10, boolean r11, int r12, org.jcodec.common.io.BitWriter r13) {
            r9 = this;
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r10.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r1 = r10.pps
            int r2 = r10.first_mb_in_slice
            java.lang.String r3 = "SH: first_mb_in_slice"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r2, r3)
            org.jcodec.codecs.h264.io.model.SliceType r2 = r10.slice_type
            int r2 = r2.ordinal()
            boolean r3 = r10.slice_type_restr
            r4 = 5
            r5 = 0
            if (r3 == 0) goto L19
            r3 = 5
            goto L1a
        L19:
            r3 = 0
        L1a:
            int r2 = r2 + r3
            java.lang.String r3 = "SH: slice_type"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r2, r3)
            int r2 = r10.pic_parameter_set_id
            java.lang.String r3 = "SH: pic_parameter_set_id"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r2, r3)
            int r2 = r10.frame_num
            int r3 = r0.log2_max_frame_num_minus4
            int r6 = r3 + 4
            r7 = 1
            int r6 = r7 << r6
            if (r2 > r6) goto L19c
            int r3 = r3 + 4
            java.lang.String r6 = "SH: frame_num"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUtrace(r13, r2, r3, r6)
            boolean r2 = r0.frame_mbs_only_flag
            if (r2 != 0) goto L4f
            boolean r2 = r10.field_pic_flag
            java.lang.String r3 = "SH: field_pic_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r13, r2, r3)
            boolean r2 = r10.field_pic_flag
            if (r2 == 0) goto L4f
            boolean r2 = r10.bottom_field_flag
            java.lang.String r3 = "SH: bottom_field_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r13, r2, r3)
        L4f:
            if (r11 == 0) goto L58
            int r2 = r10.idr_pic_id
            java.lang.String r3 = "SH: idr_pic_id"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r2, r3)
        L58:
            int r2 = r0.pic_order_cnt_type
            if (r2 != 0) goto L98
            int r2 = r10.pic_order_cnt_lsb
            int r3 = r0.log2_max_pic_order_cnt_lsb_minus4
            int r6 = r3 + 4
            int r6 = r7 << r6
            if (r2 > r6) goto L7b
            int r3 = r3 + 4
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeU(r13, r2, r3)
            boolean r2 = r1.pic_order_present_flag
            if (r2 == 0) goto L98
            boolean r2 = r0.field_pic_flag
            if (r2 != 0) goto L98
            int r2 = r10.delta_pic_order_cnt_bottom
            java.lang.String r3 = "SH: delta_pic_order_cnt_bottom"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r13, r2, r3)
            goto L98
        L7b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            int r11 = r0.log2_max_pic_order_cnt_lsb_minus4
            int r11 = r11 + 4
            int r11 = r7 << r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "pic_order_cnt_lsb > "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L98:
            int r2 = r0.pic_order_cnt_type
            if (r2 != r7) goto Lb8
            boolean r2 = r0.delta_pic_order_always_zero_flag
            if (r2 != 0) goto Lb8
            int[] r2 = r10.delta_pic_order_cnt
            r2 = r2[r5]
            java.lang.String r3 = "SH: delta_pic_order_cnt"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r13, r2, r3)
            boolean r2 = r1.pic_order_present_flag
            if (r2 == 0) goto Lb8
            boolean r2 = r0.field_pic_flag
            if (r2 != 0) goto Lb8
            int[] r2 = r10.delta_pic_order_cnt
            r2 = r2[r7]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r13, r2, r3)
        Lb8:
            boolean r2 = r1.redundant_pic_cnt_present_flag
            if (r2 == 0) goto Lc3
            int r2 = r10.redundant_pic_cnt
            java.lang.String r3 = "SH: redundant_pic_cnt"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r2, r3)
        Lc3:
            org.jcodec.codecs.h264.io.model.SliceType r2 = r10.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r3 = org.jcodec.codecs.h264.io.model.SliceType.B
            if (r2 != r3) goto Ld0
            boolean r2 = r10.direct_spatial_mv_pred_flag
            java.lang.String r6 = "SH: direct_spatial_mv_pred_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r13, r2, r6)
        Ld0:
            org.jcodec.codecs.h264.io.model.SliceType r2 = r10.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r6 = org.jcodec.codecs.h264.io.model.SliceType.P
            if (r2 == r6) goto Ldc
            org.jcodec.codecs.h264.io.model.SliceType r8 = org.jcodec.codecs.h264.io.model.SliceType.SP
            if (r2 == r8) goto Ldc
            if (r2 != r3) goto Lfd
        Ldc:
            boolean r2 = r10.num_ref_idx_active_override_flag
            java.lang.String r8 = "SH: num_ref_idx_active_override_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r13, r2, r8)
            boolean r2 = r10.num_ref_idx_active_override_flag
            if (r2 == 0) goto Lfd
            int[] r2 = r10.num_ref_idx_active_minus1
            r2 = r2[r5]
            java.lang.String r5 = "SH: num_ref_idx_l0_active_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r2, r5)
            org.jcodec.codecs.h264.io.model.SliceType r2 = r10.slice_type
            if (r2 != r3) goto Lfd
            int[] r2 = r10.num_ref_idx_active_minus1
            r2 = r2[r7]
            java.lang.String r5 = "SH: num_ref_idx_l1_active_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r2, r5)
        Lfd:
            r9.writeRefPicListReordering(r10, r13)
            boolean r2 = r1.weighted_pred_flag
            if (r2 == 0) goto L10c
            org.jcodec.codecs.h264.io.model.SliceType r2 = r10.slice_type
            if (r2 == r6) goto L114
            org.jcodec.codecs.h264.io.model.SliceType r5 = org.jcodec.codecs.h264.io.model.SliceType.SP
            if (r2 == r5) goto L114
        L10c:
            int r2 = r1.weighted_bipred_idc
            if (r2 != r7) goto L117
            org.jcodec.codecs.h264.io.model.SliceType r2 = r10.slice_type
            if (r2 != r3) goto L117
        L114:
            r9.writePredWeightTable(r10, r13)
        L117:
            if (r12 == 0) goto L11c
            r9.writeDecRefPicMarking(r10, r11, r13)
        L11c:
            boolean r11 = r1.entropy_coding_mode_flag
            if (r11 == 0) goto L12f
            org.jcodec.codecs.h264.io.model.SliceType r11 = r10.slice_type
            boolean r11 = r11.isInter()
            if (r11 == 0) goto L12f
            int r11 = r10.cabac_init_idc
            java.lang.String r12 = "SH: cabac_init_idc"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r11, r12)
        L12f:
            int r11 = r10.slice_qp_delta
            java.lang.String r12 = "SH: slice_qp_delta"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r13, r11, r12)
            org.jcodec.codecs.h264.io.model.SliceType r11 = r10.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r12 = org.jcodec.codecs.h264.io.model.SliceType.SP
            if (r11 == r12) goto L140
            org.jcodec.codecs.h264.io.model.SliceType r2 = org.jcodec.codecs.h264.io.model.SliceType.SI
            if (r11 != r2) goto L150
        L140:
            if (r11 != r12) goto L149
            boolean r11 = r10.sp_for_switch_flag
            java.lang.String r12 = "SH: sp_for_switch_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r13, r11, r12)
        L149:
            int r11 = r10.slice_qs_delta
            java.lang.String r12 = "SH: slice_qs_delta"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r13, r11, r12)
        L150:
            boolean r11 = r1.deblocking_filter_control_present_flag
            if (r11 == 0) goto L16d
            int r11 = r10.disable_deblocking_filter_idc
            java.lang.String r12 = "SH: disable_deblocking_filter_idc"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r13, r11, r12)
            int r11 = r10.disable_deblocking_filter_idc
            if (r11 == r7) goto L16d
            int r11 = r10.slice_alpha_c0_offset_div2
            java.lang.String r12 = "SH: slice_alpha_c0_offset_div2"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r13, r11, r12)
            int r11 = r10.slice_beta_offset_div2
            java.lang.String r12 = "SH: slice_beta_offset_div2"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r13, r11, r12)
        L16d:
            int r11 = r1.num_slice_groups_minus1
            if (r11 <= 0) goto L19b
            int r11 = r1.slice_group_map_type
            r12 = 3
            if (r11 < r12) goto L19b
            if (r11 > r4) goto L19b
            int r11 = r0.pic_height_in_map_units_minus1
            int r12 = r11 + 1
            int r0 = r0.pic_width_in_mbs_minus1
            int r2 = r0 + 1
            int r12 = r12 * r2
            int r1 = r1.slice_group_change_rate_minus1
            int r2 = r1 + 1
            int r12 = r12 / r2
            int r11 = r11 + r7
            int r0 = r0 + r7
            int r11 = r11 * r0
            int r1 = r1 + r7
            int r11 = r11 % r1
            if (r11 <= 0) goto L191
            int r12 = r12 + 1
        L191:
            int r12 = r12 + r7
            int r11 = CeilLog2(r12)
            int r10 = r10.slice_group_change_cycle
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeU(r13, r10, r11)
        L19b:
            return
        L19c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            int r11 = r0.log2_max_frame_num_minus4
            int r11 = r11 + 4
            int r11 = r7 << r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "frame_num > "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
    }
}
