package com.googlecode.mp4parser.authoring.tracks.h265;

/* loaded from: classes2.dex */
public class SequenceParameterSetRbsp {
    public SequenceParameterSetRbsp(java.io.InputStream r10) throws java.io.IOException {
            r9 = this;
            r9.<init>()
            com.googlecode.mp4parser.h264.read.CAVLCReader r0 = new com.googlecode.mp4parser.h264.read.CAVLCReader
            r0.<init>(r10)
            r10 = 4
            java.lang.String r1 = "sps_video_parameter_set_id"
            r0.readNBit(r10, r1)
            r1 = 3
            java.lang.String r2 = "sps_max_sub_layers_minus1"
            long r2 = r0.readNBit(r1, r2)
            int r3 = (int) r2
            java.lang.String r2 = "sps_temporal_id_nesting_flag"
            r0.readBool(r2)
            r9.profile_tier_level(r3, r0)
            java.lang.String r2 = "sps_seq_parameter_set_id"
            r0.readUE(r2)
            java.lang.String r2 = "chroma_format_idc"
            int r2 = r0.readUE(r2)
            if (r2 != r1) goto L52
            r0.read1Bit()
            java.lang.String r1 = "pic_width_in_luma_samples"
            r0.readUE(r1)
            r0.readUE(r1)
            java.lang.String r1 = "conformance_window_flag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto L52
            java.lang.String r1 = "conf_win_left_offset"
            r0.readUE(r1)
            java.lang.String r1 = "conf_win_right_offset"
            r0.readUE(r1)
            java.lang.String r1 = "conf_win_top_offset"
            r0.readUE(r1)
            java.lang.String r1 = "conf_win_bottom_offset"
            r0.readUE(r1)
        L52:
            java.lang.String r1 = "bit_depth_luma_minus8"
            r0.readUE(r1)
            java.lang.String r1 = "bit_depth_chroma_minus8"
            r0.readUE(r1)
            java.lang.String r1 = "log2_max_pic_order_cnt_lsb_minus4"
            r0.readUE(r1)
            java.lang.String r1 = "sps_sub_layer_ordering_info_present_flag"
            boolean r1 = r0.readBool(r1)
            r2 = 0
            if (r1 == 0) goto L6c
            r4 = 0
            goto L6d
        L6c:
            r4 = r3
        L6d:
            int r4 = r3 - r4
            int r4 = r4 + 1
            int[] r5 = new int[r4]
            int[] r6 = new int[r4]
            int[] r4 = new int[r4]
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            r2 = r3
        L7b:
            if (r2 <= r3) goto Ld0
            java.lang.String r1 = "log2_min_luma_coding_block_size_minus3"
            r0.readUE(r1)
            java.lang.String r1 = "log2_diff_max_min_luma_coding_block_size"
            r0.readUE(r1)
            java.lang.String r1 = "log2_min_transform_block_size_minus2"
            r0.readUE(r1)
            java.lang.String r1 = "log2_diff_max_min_transform_block_size"
            r0.readUE(r1)
            java.lang.String r1 = "max_transform_hierarchy_depth_inter"
            r0.readUE(r1)
            java.lang.String r1 = "max_transform_hierarchy_depth_intra"
            r0.readUE(r1)
            java.lang.String r1 = "scaling_list_enabled_flag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto Lae
            java.lang.String r1 = "sps_scaling_list_data_present_flag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto Lae
            r9.scaling_list_data(r0)
        Lae:
            java.lang.String r1 = "amp_enabled_flag"
            r0.readBool(r1)
            java.lang.String r1 = "sample_adaptive_offset_enabled_flag"
            r0.readBool(r1)
            java.lang.String r1 = "pcm_enabled_flag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto Lcf
            java.lang.String r1 = "pcm_sample_bit_depth_luma_minus1"
            r0.readNBit(r10, r1)
            java.lang.String r1 = "pcm_sample_bit_depth_chroma_minus1"
            r0.readNBit(r10, r1)
            java.lang.String r10 = "log2_min_pcm_luma_coding_block_size_minus3"
            r0.readUE(r10)
        Lcf:
            return
        Ld0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "sps_max_dec_pic_buffering_minus1["
            r1.<init>(r7)
            r1.append(r2)
            java.lang.String r7 = "]"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            int r1 = r0.readUE(r1)
            r5[r2] = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "sps_max_num_reorder_pics["
            r1.<init>(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            int r1 = r0.readUE(r1)
            r6[r2] = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "sps_max_latency_increase_plus1["
            r1.<init>(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            int r1 = r0.readUE(r1)
            r4[r2] = r1
            int r2 = r2 + 1
            goto L7b
    }

    private void profile_tier_level(int r21, com.googlecode.mp4parser.h264.read.CAVLCReader r22) throws java.io.IOException {
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            java.lang.String r3 = "general_profile_space"
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
            if (r7 < r4) goto L1dd
            java.lang.String r5 = "general_progressive_source_flag"
            r1.readBool(r5)
            java.lang.String r5 = "general_interlaced_source_flag"
            r1.readBool(r5)
            java.lang.String r5 = "general_non_packed_constraint_flag"
            r1.readBool(r5)
            java.lang.String r5 = "general_frame_only_constraint_flag"
            r1.readBool(r5)
            r8 = 44
            java.lang.String r5 = "general_reserved_zero_44bits"
            r1.readNBit(r8, r5)
            r22.readByte()
            boolean[] r9 = new boolean[r0]
            boolean[] r10 = new boolean[r0]
            r5 = 0
        L40:
            java.lang.String r7 = "]"
            if (r5 < r0) goto L1a0
            r11 = 8
            if (r0 <= 0) goto L68
            int[] r5 = new int[r11]
            r12 = r0
        L4b:
            if (r12 < r11) goto L4e
            goto L68
        L4e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "reserved_zero_2bits["
            r13.<init>(r14)
            r13.append(r12)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            int r13 = r1.readU(r2, r13)
            r5[r12] = r13
            int r12 = r12 + 1
            goto L4b
        L68:
            int[] r12 = new int[r0]
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
            boolean[] r11 = new boolean[r0]
            boolean[] r8 = new boolean[r0]
            long[] r4 = new long[r0]
            int[] r3 = new int[r0]
            r2 = 0
        L8b:
            if (r2 < r0) goto L8e
            return
        L8e:
            boolean r17 = r9[r2]
            if (r17 == 0) goto L172
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r17 = r9
            java.lang.String r9 = "sub_layer_profile_space["
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r9 = 2
            int r0 = r1.readU(r9, r0)
            r12[r2] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "sub_layer_tier_flag["
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r13[r2] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "sub_layer_profile_idc["
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r9 = 5
            int r0 = r1.readU(r9, r0)
            r14[r2] = r0
            r0 = 0
        Ldc:
            r9 = 32
            if (r0 < r9) goto L147
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "sub_layer_progressive_source_flag["
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r5[r2] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "sub_layer_interlaced_source_flag["
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r6[r2] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "sub_layer_non_packed_constraint_flag["
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r11[r2] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "sub_layer_frame_only_constraint_flag["
            r0.<init>(r9)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r8[r2] = r0
            r9 = 44
            long r18 = r1.readNBit(r9)
            r4[r2] = r18
            r19 = r4
            goto L176
        L147:
            r9 = 44
            r16 = r15[r2]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r19 = r4
            java.lang.String r4 = "sub_layer_profile_compatibility_flag["
            r9.<init>(r4)
            r9.append(r2)
            java.lang.String r4 = "]["
            r9.append(r4)
            r9.append(r0)
            r9.append(r7)
            java.lang.String r4 = r9.toString()
            boolean r4 = r1.readBool(r4)
            r16[r0] = r4
            int r0 = r0 + 1
            r4 = r19
            goto Ldc
        L172:
            r19 = r4
            r17 = r9
        L176:
            boolean r0 = r10[r2]
            if (r0 == 0) goto L194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "sub_layer_level_idc["
            r0.<init>(r4)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r4 = 8
            int r0 = r1.readU(r4, r0)
            r3[r2] = r0
            goto L196
        L194:
            r4 = 8
        L196:
            int r2 = r2 + 1
            r0 = r21
            r9 = r17
            r4 = r19
            goto L8b
        L1a0:
            r17 = r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_profile_present_flag["
            r0.<init>(r2)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r17[r5] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "sub_layer_level_present_flag["
            r0.<init>(r2)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.readBool(r0)
            r10[r5] = r0
            int r5 = r5 + 1
            r0 = r21
            r2 = 2
            r3 = 5
            r4 = 32
            r6 = 0
            r8 = 44
            goto L40
        L1dd:
            boolean r0 = r22.readBool()
            r5[r7] = r0
            int r7 = r7 + 1
            r0 = r21
            r2 = 2
            r3 = 5
            r4 = 32
            r6 = 0
            goto L1b
    }

    private void scaling_list_data(com.googlecode.mp4parser.h264.read.CAVLCReader r17) throws java.io.IOException {
            r16 = this;
            r0 = r17
            r1 = 4
            boolean[][] r2 = new boolean[r1][]
            int[][] r3 = new int[r1][]
            r4 = 2
            int[][] r5 = new int[r4][]
            int[][][] r6 = new int[r1][][]
            r7 = 0
            r8 = 0
        Le:
            if (r8 < r1) goto L11
            return
        L11:
            r9 = 0
        L12:
            r10 = 6
            r11 = 3
            if (r8 != r11) goto L18
            r12 = 2
            goto L19
        L18:
            r12 = 6
        L19:
            if (r9 < r12) goto L1e
            int r8 = r8 + 1
            goto Le
        L1e:
            if (r8 != r11) goto L22
            r12 = 2
            goto L23
        L22:
            r12 = 6
        L23:
            boolean[] r12 = new boolean[r12]
            r2[r8] = r12
            if (r8 != r11) goto L2b
            r12 = 2
            goto L2c
        L2b:
            r12 = 6
        L2c:
            int[] r12 = new int[r12]
            r3[r8] = r12
            if (r8 != r11) goto L33
            r10 = 2
        L33:
            int[][] r10 = new int[r10][]
            r6[r8] = r10
            r10 = r2[r8]
            boolean r11 = r17.readBool()
            r10[r9] = r11
            r10 = r2[r8]
            boolean r10 = r10[r9]
            java.lang.String r11 = "]"
            if (r10 != 0) goto L69
            r10 = r3[r8]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "scaling_list_pred_matrix_id_delta["
            r12.<init>(r13)
            r12.append(r8)
            java.lang.String r13 = "]["
            r12.append(r13)
            r12.append(r9)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            int r11 = r0.readUE(r11)
            r10[r9] = r11
            goto Laa
        L69:
            r10 = 64
            int r12 = r8 << 1
            int r12 = r12 + r1
            r13 = 1
            int r12 = r13 << r12
            int r10 = java.lang.Math.min(r10, r12)
            r12 = 8
            if (r8 <= r13) goto La1
            int r13 = r8 + (-2)
            r14 = r5[r13]
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "scaling_list_dc_coef_minus8["
            r15.<init>(r1)
            r15.append(r8)
            java.lang.String r1 = "- 2]["
            r15.append(r1)
            r15.append(r9)
            r15.append(r11)
            java.lang.String r1 = r15.toString()
            int r1 = r0.readSE(r1)
            r14[r9] = r1
            r1 = r5[r13]
            r1 = r1[r9]
            int r12 = r12 + r1
        La1:
            r1 = r6[r8]
            int[] r11 = new int[r10]
            r1[r9] = r11
            r1 = 0
        La8:
            if (r1 < r10) goto Laf
        Laa:
            int r9 = r9 + 1
            r1 = 4
            goto L12
        Laf:
            java.lang.String r11 = "scaling_list_delta_coef "
            int r11 = r0.readSE(r11)
            int r12 = r12 + r11
            int r12 = r12 + 256
            int r12 = r12 % 256
            r11 = r6[r8]
            r11 = r11[r9]
            r11[r1] = r12
            int r1 = r1 + 1
            goto La8
    }
}
