package com.googlecode.mp4parser.authoring.tracks.h265;

/* loaded from: classes2.dex */
public class VideoParameterSet {
    java.nio.ByteBuffer vps;
    int vps_parameter_set_id;

    public VideoParameterSet(java.nio.ByteBuffer r15) throws java.io.IOException {
            r14 = this;
            r14.<init>()
            r14.vps = r15
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
            int r15 = r0.readU(r15, r1)
            r14.vps_parameter_set_id = r15
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
            r5 = 1
            if (r4 == 0) goto L50
            r6 = 1
            goto L52
        L50:
            int r6 = r3 + 1
        L52:
            int[] r6 = new int[r6]
            if (r4 == 0) goto L58
            r7 = 1
            goto L5a
        L58:
            int r7 = r3 + 1
        L5a:
            int[] r7 = new int[r7]
            if (r4 == 0) goto L60
            r8 = 1
            goto L62
        L60:
            int r8 = r3 + 1
        L62:
            int[] r8 = new int[r8]
            if (r4 == 0) goto L68
            r4 = 0
            goto L69
        L68:
            r4 = r3
        L69:
            java.lang.String r9 = "]"
            if (r4 <= r3) goto L139
            java.lang.String r4 = "vps_max_layer_id"
            int r10 = r0.readU(r1, r4)
            java.lang.String r1 = "vps_num_layer_sets_minus1"
            int r11 = r0.readUE(r1)
            int[] r15 = new int[r15]
            r15[r5] = r10
            r15[r2] = r11
            java.lang.Class<boolean> r1 = boolean.class
            java.lang.Object r15 = java.lang.reflect.Array.newInstance(r1, r15)
            r12 = r15
            boolean[][] r12 = (boolean[][]) r12
            r13 = 1
        L89:
            if (r13 <= r11) goto L10e
            java.lang.String r15 = "vps_timing_info_present_flag"
            boolean r15 = r0.readBool(r15)
            if (r15 == 0) goto Lf5
            r15 = 32
            java.lang.String r1 = "vps_num_units_in_tick"
            r0.readU(r15, r1)
            java.lang.String r1 = "vps_time_scale"
            r0.readU(r15, r1)
            java.lang.String r15 = "vps_poc_proportional_to_timing_flag"
            boolean r15 = r0.readBool(r15)
            if (r15 == 0) goto Lac
            java.lang.String r15 = "vps_num_ticks_poc_diff_one_minus1"
            r0.readUE(r15)
        Lac:
            java.lang.String r15 = "vps_num_hrd_parameters"
            int r15 = r0.readUE(r15)
            int[] r1 = new int[r15]
            boolean[] r4 = new boolean[r15]
            r6 = 0
        Lb7:
            if (r6 < r15) goto Lba
            goto Lf5
        Lba:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "hrd_layer_set_idx["
            r7.<init>(r8)
            r7.append(r6)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            int r7 = r0.readUE(r7)
            r1[r6] = r7
            if (r6 <= 0) goto Leb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "cprms_present_flag["
            r7.<init>(r8)
            r7.append(r6)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            boolean r7 = r0.readBool(r7)
            r4[r6] = r7
            goto Led
        Leb:
            r4[r2] = r5
        Led:
            boolean r7 = r4[r6]
            r14.hrd_parameters(r7, r3, r0)
            int r6 = r6 + 1
            goto Lb7
        Lf5:
            java.lang.String r15 = "vps_extension_flag"
            boolean r15 = r0.readBool(r15)
            if (r15 == 0) goto L10a
        Lfd:
            boolean r15 = r0.moreRBSPData()
            if (r15 != 0) goto L104
            goto L10a
        L104:
            java.lang.String r15 = "vps_extension_data_flag"
            r0.readBool(r15)
            goto Lfd
        L10a:
            r0.readTrailingBits()
            return
        L10e:
            r15 = 0
        L10f:
            if (r15 <= r10) goto L115
            int r13 = r13 + 1
            goto L89
        L115:
            r1 = r12[r13]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "layer_id_included_flag["
            r4.<init>(r6)
            r4.append(r13)
            java.lang.String r6 = "]["
            r4.append(r6)
            r4.append(r15)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.readBool(r4)
            r1[r15] = r4
            int r15 = r15 + 1
            goto L10f
        L139:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "vps_max_dec_pic_buffering_minus1["
            r10.<init>(r11)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            int r10 = r0.readUE(r10)
            r6[r4] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            int r10 = r0.readUE(r10)
            r7[r4] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            int r9 = r0.readUE(r9)
            r8[r4] = r9
            int r4 = r4 + 1
            goto L69
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

    public java.nio.ByteBuffer toByteBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.vps
            return r0
    }
}
