package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class SeqParameterSet extends com.googlecode.mp4parser.h264.model.BitstreamElement {
    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public com.googlecode.mp4parser.h264.model.ChromaFormat chroma_format_idc;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public boolean constraint_set_4_flag;
    public boolean constraint_set_5_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean direct_8x8_inference_flag;
    public boolean entropy_coding_mode_flag;
    public boolean field_pic_flag;
    public int frame_crop_bottom_offset;
    public int frame_crop_left_offset;
    public int frame_crop_right_offset;
    public int frame_crop_top_offset;
    public boolean frame_cropping_flag;
    public boolean frame_mbs_only_flag;
    public boolean gaps_in_frame_num_value_allowed_flag;
    public int level_idc;
    public int log2_max_frame_num_minus4;
    public int log2_max_pic_order_cnt_lsb_minus4;
    public boolean mb_adaptive_frame_field_flag;
    public int num_ref_frames;
    public int num_ref_frames_in_pic_order_cnt_cycle;
    public int[] offsetForRefFrame;
    public int offset_for_non_ref_pic;
    public int offset_for_top_to_bottom_field;
    public int pic_height_in_map_units_minus1;
    public int pic_order_cnt_type;
    public int pic_width_in_mbs_minus1;
    public int profile_idc;
    public boolean qpprime_y_zero_transform_bypass_flag;
    public long reserved_zero_2bits;
    public boolean residual_color_transform_flag;
    public com.googlecode.mp4parser.h264.model.ScalingMatrix scalingMatrix;
    public int seq_parameter_set_id;
    public com.googlecode.mp4parser.h264.model.VUIParameters vuiParams;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    public SeqParameterSet() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.googlecode.mp4parser.h264.model.VUIParameters ReadVUIParameters(com.googlecode.mp4parser.h264.read.CAVLCReader r5) throws java.io.IOException {
            com.googlecode.mp4parser.h264.model.VUIParameters r0 = new com.googlecode.mp4parser.h264.model.VUIParameters
            r0.<init>()
            java.lang.String r1 = "VUI: aspect_ratio_info_present_flag"
            boolean r1 = r5.readBool(r1)
            r0.aspect_ratio_info_present_flag = r1
            r2 = 8
            if (r1 == 0) goto L36
            java.lang.String r1 = "VUI: aspect_ratio"
            long r3 = r5.readNBit(r2, r1)
            int r1 = (int) r3
            com.googlecode.mp4parser.h264.model.AspectRatio r1 = com.googlecode.mp4parser.h264.model.AspectRatio.fromValue(r1)
            r0.aspect_ratio = r1
            com.googlecode.mp4parser.h264.model.AspectRatio r3 = com.googlecode.mp4parser.h264.model.AspectRatio.Extended_SAR
            if (r1 != r3) goto L36
            r1 = 16
            java.lang.String r3 = "VUI: sar_width"
            long r3 = r5.readNBit(r1, r3)
            int r4 = (int) r3
            r0.sar_width = r4
            java.lang.String r3 = "VUI: sar_height"
            long r3 = r5.readNBit(r1, r3)
            int r1 = (int) r3
            r0.sar_height = r1
        L36:
            java.lang.String r1 = "VUI: overscan_info_present_flag"
            boolean r1 = r5.readBool(r1)
            r0.overscan_info_present_flag = r1
            if (r1 == 0) goto L48
            java.lang.String r1 = "VUI: overscan_appropriate_flag"
            boolean r1 = r5.readBool(r1)
            r0.overscan_appropriate_flag = r1
        L48:
            java.lang.String r1 = "VUI: video_signal_type_present_flag"
            boolean r1 = r5.readBool(r1)
            r0.video_signal_type_present_flag = r1
            if (r1 == 0) goto L89
            r1 = 3
            java.lang.String r3 = "VUI: video_format"
            long r3 = r5.readNBit(r1, r3)
            int r1 = (int) r3
            r0.video_format = r1
            java.lang.String r1 = "VUI: video_full_range_flag"
            boolean r1 = r5.readBool(r1)
            r0.video_full_range_flag = r1
            java.lang.String r1 = "VUI: colour_description_present_flag"
            boolean r1 = r5.readBool(r1)
            r0.colour_description_present_flag = r1
            if (r1 == 0) goto L89
            java.lang.String r1 = "VUI: colour_primaries"
            long r3 = r5.readNBit(r2, r1)
            int r1 = (int) r3
            r0.colour_primaries = r1
            java.lang.String r1 = "VUI: transfer_characteristics"
            long r3 = r5.readNBit(r2, r1)
            int r1 = (int) r3
            r0.transfer_characteristics = r1
            java.lang.String r1 = "VUI: matrix_coefficients"
            long r1 = r5.readNBit(r2, r1)
            int r2 = (int) r1
            r0.matrix_coefficients = r2
        L89:
            java.lang.String r1 = "VUI: chroma_loc_info_present_flag"
            boolean r1 = r5.readBool(r1)
            r0.chroma_loc_info_present_flag = r1
            if (r1 == 0) goto La3
            java.lang.String r1 = "VUI chroma_sample_loc_type_top_field"
            int r1 = r5.readUE(r1)
            r0.chroma_sample_loc_type_top_field = r1
            java.lang.String r1 = "VUI chroma_sample_loc_type_bottom_field"
            int r1 = r5.readUE(r1)
            r0.chroma_sample_loc_type_bottom_field = r1
        La3:
            java.lang.String r1 = "VUI: timing_info_present_flag"
            boolean r1 = r5.readBool(r1)
            r0.timing_info_present_flag = r1
            if (r1 == 0) goto Lc9
            r1 = 32
            java.lang.String r2 = "VUI: num_units_in_tick"
            long r2 = r5.readNBit(r1, r2)
            int r3 = (int) r2
            r0.num_units_in_tick = r3
            java.lang.String r2 = "VUI: time_scale"
            long r1 = r5.readNBit(r1, r2)
            int r2 = (int) r1
            r0.time_scale = r2
            java.lang.String r1 = "VUI: fixed_frame_rate_flag"
            boolean r1 = r5.readBool(r1)
            r0.fixed_frame_rate_flag = r1
        Lc9:
            java.lang.String r1 = "VUI: nal_hrd_parameters_present_flag"
            boolean r1 = r5.readBool(r1)
            if (r1 == 0) goto Ld7
            com.googlecode.mp4parser.h264.model.HRDParameters r2 = readHRDParameters(r5)
            r0.nalHRDParams = r2
        Ld7:
            java.lang.String r2 = "VUI: vcl_hrd_parameters_present_flag"
            boolean r2 = r5.readBool(r2)
            if (r2 == 0) goto Le5
            com.googlecode.mp4parser.h264.model.HRDParameters r3 = readHRDParameters(r5)
            r0.vclHRDParams = r3
        Le5:
            if (r1 != 0) goto Le9
            if (r2 == 0) goto Lf1
        Le9:
            java.lang.String r1 = "VUI: low_delay_hrd_flag"
            boolean r1 = r5.readBool(r1)
            r0.low_delay_hrd_flag = r1
        Lf1:
            java.lang.String r1 = "VUI: pic_struct_present_flag"
            boolean r1 = r5.readBool(r1)
            r0.pic_struct_present_flag = r1
            java.lang.String r1 = "VUI: bitstream_restriction_flag"
            boolean r1 = r5.readBool(r1)
            if (r1 == 0) goto L14c
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r1 = new com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction
            r1.<init>()
            r0.bitstreamRestriction = r1
            java.lang.String r2 = "VUI: motion_vectors_over_pic_boundaries_flag"
            boolean r2 = r5.readBool(r2)
            r1.motion_vectors_over_pic_boundaries_flag = r2
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI max_bytes_per_pic_denom"
            int r2 = r5.readUE(r2)
            r1.max_bytes_per_pic_denom = r2
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI max_bits_per_mb_denom"
            int r2 = r5.readUE(r2)
            r1.max_bits_per_mb_denom = r2
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI log2_max_mv_length_horizontal"
            int r2 = r5.readUE(r2)
            r1.log2_max_mv_length_horizontal = r2
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI log2_max_mv_length_vertical"
            int r2 = r5.readUE(r2)
            r1.log2_max_mv_length_vertical = r2
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI num_reorder_frames"
            int r2 = r5.readUE(r2)
            r1.num_reorder_frames = r2
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI max_dec_frame_buffering"
            int r5 = r5.readUE(r2)
            r1.max_dec_frame_buffering = r5
        L14c:
            return r0
    }

    public static com.googlecode.mp4parser.h264.model.SeqParameterSet read(java.io.InputStream r5) throws java.io.IOException {
            com.googlecode.mp4parser.h264.read.CAVLCReader r0 = new com.googlecode.mp4parser.h264.read.CAVLCReader
            r0.<init>(r5)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r5 = new com.googlecode.mp4parser.h264.model.SeqParameterSet
            r5.<init>()
            r1 = 8
            java.lang.String r2 = "SPS: profile_idc"
            long r2 = r0.readNBit(r1, r2)
            int r3 = (int) r2
            r5.profile_idc = r3
            java.lang.String r2 = "SPS: constraint_set_0_flag"
            boolean r2 = r0.readBool(r2)
            r5.constraint_set_0_flag = r2
            java.lang.String r2 = "SPS: constraint_set_1_flag"
            boolean r2 = r0.readBool(r2)
            r5.constraint_set_1_flag = r2
            java.lang.String r2 = "SPS: constraint_set_2_flag"
            boolean r2 = r0.readBool(r2)
            r5.constraint_set_2_flag = r2
            java.lang.String r2 = "SPS: constraint_set_3_flag"
            boolean r2 = r0.readBool(r2)
            r5.constraint_set_3_flag = r2
            java.lang.String r2 = "SPS: constraint_set_4_flag"
            boolean r2 = r0.readBool(r2)
            r5.constraint_set_4_flag = r2
            java.lang.String r2 = "SPS: constraint_set_5_flag"
            boolean r2 = r0.readBool(r2)
            r5.constraint_set_5_flag = r2
            r2 = 2
            java.lang.String r3 = "SPS: reserved_zero_2bits"
            long r2 = r0.readNBit(r2, r3)
            r5.reserved_zero_2bits = r2
            java.lang.String r2 = "SPS: level_idc"
            long r1 = r0.readNBit(r1, r2)
            int r2 = (int) r1
            r5.level_idc = r2
            java.lang.String r1 = "SPS: seq_parameter_set_id"
            int r1 = r0.readUE(r1)
            r5.seq_parameter_set_id = r1
            int r1 = r5.profile_idc
            r2 = 100
            if (r1 == r2) goto L77
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L77
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L77
            r2 = 144(0x90, float:2.02E-43)
            if (r1 != r2) goto L72
            goto L77
        L72:
            com.googlecode.mp4parser.h264.model.ChromaFormat r1 = com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_420
            r5.chroma_format_idc = r1
            goto Lb2
        L77:
            java.lang.String r1 = "SPS: chroma_format_idc"
            int r1 = r0.readUE(r1)
            com.googlecode.mp4parser.h264.model.ChromaFormat r1 = com.googlecode.mp4parser.h264.model.ChromaFormat.fromId(r1)
            r5.chroma_format_idc = r1
            com.googlecode.mp4parser.h264.model.ChromaFormat r2 = com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_444
            if (r1 != r2) goto L8f
            java.lang.String r1 = "SPS: residual_color_transform_flag"
            boolean r1 = r0.readBool(r1)
            r5.residual_color_transform_flag = r1
        L8f:
            java.lang.String r1 = "SPS: bit_depth_luma_minus8"
            int r1 = r0.readUE(r1)
            r5.bit_depth_luma_minus8 = r1
            java.lang.String r1 = "SPS: bit_depth_chroma_minus8"
            int r1 = r0.readUE(r1)
            r5.bit_depth_chroma_minus8 = r1
            java.lang.String r1 = "SPS: qpprime_y_zero_transform_bypass_flag"
            boolean r1 = r0.readBool(r1)
            r5.qpprime_y_zero_transform_bypass_flag = r1
            java.lang.String r1 = "SPS: seq_scaling_matrix_present_lag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto Lb2
            readScalingListMatrix(r0, r5)
        Lb2:
            java.lang.String r1 = "SPS: log2_max_frame_num_minus4"
            int r1 = r0.readUE(r1)
            r5.log2_max_frame_num_minus4 = r1
            java.lang.String r1 = "SPS: pic_order_cnt_type"
            int r1 = r0.readUE(r1)
            r5.pic_order_cnt_type = r1
            if (r1 != 0) goto Lcd
            java.lang.String r1 = "SPS: log2_max_pic_order_cnt_lsb_minus4"
            int r1 = r0.readUE(r1)
            r5.log2_max_pic_order_cnt_lsb_minus4 = r1
            goto L118
        Lcd:
            r2 = 1
            if (r1 != r2) goto L118
            java.lang.String r1 = "SPS: delta_pic_order_always_zero_flag"
            boolean r1 = r0.readBool(r1)
            r5.delta_pic_order_always_zero_flag = r1
            java.lang.String r1 = "SPS: offset_for_non_ref_pic"
            int r1 = r0.readSE(r1)
            r5.offset_for_non_ref_pic = r1
            java.lang.String r1 = "SPS: offset_for_top_to_bottom_field"
            int r1 = r0.readSE(r1)
            r5.offset_for_top_to_bottom_field = r1
            java.lang.String r1 = "SPS: num_ref_frames_in_pic_order_cnt_cycle"
            int r1 = r0.readUE(r1)
            r5.num_ref_frames_in_pic_order_cnt_cycle = r1
            int[] r1 = new int[r1]
            r5.offsetForRefFrame = r1
            r1 = 0
        Lf5:
            int r2 = r5.num_ref_frames_in_pic_order_cnt_cycle
            if (r1 < r2) goto Lfa
            goto L118
        Lfa:
            int[] r2 = r5.offsetForRefFrame
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SPS: offsetForRefFrame ["
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = r0.readSE(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lf5
        L118:
            java.lang.String r1 = "SPS: num_ref_frames"
            int r1 = r0.readUE(r1)
            r5.num_ref_frames = r1
            java.lang.String r1 = "SPS: gaps_in_frame_num_value_allowed_flag"
            boolean r1 = r0.readBool(r1)
            r5.gaps_in_frame_num_value_allowed_flag = r1
            java.lang.String r1 = "SPS: pic_width_in_mbs_minus1"
            int r1 = r0.readUE(r1)
            r5.pic_width_in_mbs_minus1 = r1
            java.lang.String r1 = "SPS: pic_height_in_map_units_minus1"
            int r1 = r0.readUE(r1)
            r5.pic_height_in_map_units_minus1 = r1
            java.lang.String r1 = "SPS: frame_mbs_only_flag"
            boolean r1 = r0.readBool(r1)
            r5.frame_mbs_only_flag = r1
            if (r1 != 0) goto L14a
            java.lang.String r1 = "SPS: mb_adaptive_frame_field_flag"
            boolean r1 = r0.readBool(r1)
            r5.mb_adaptive_frame_field_flag = r1
        L14a:
            java.lang.String r1 = "SPS: direct_8x8_inference_flag"
            boolean r1 = r0.readBool(r1)
            r5.direct_8x8_inference_flag = r1
            java.lang.String r1 = "SPS: frame_cropping_flag"
            boolean r1 = r0.readBool(r1)
            r5.frame_cropping_flag = r1
            if (r1 == 0) goto L17c
            java.lang.String r1 = "SPS: frame_crop_left_offset"
            int r1 = r0.readUE(r1)
            r5.frame_crop_left_offset = r1
            java.lang.String r1 = "SPS: frame_crop_right_offset"
            int r1 = r0.readUE(r1)
            r5.frame_crop_right_offset = r1
            java.lang.String r1 = "SPS: frame_crop_top_offset"
            int r1 = r0.readUE(r1)
            r5.frame_crop_top_offset = r1
            java.lang.String r1 = "SPS: frame_crop_bottom_offset"
            int r1 = r0.readUE(r1)
            r5.frame_crop_bottom_offset = r1
        L17c:
            java.lang.String r1 = "SPS: vui_parameters_present_flag"
            boolean r1 = r0.readBool(r1)
            if (r1 == 0) goto L18a
            com.googlecode.mp4parser.h264.model.VUIParameters r1 = ReadVUIParameters(r0)
            r5.vuiParams = r1
        L18a:
            r0.readTrailingBits()
            return r5
    }

    public static com.googlecode.mp4parser.h264.model.SeqParameterSet read(byte[] r1) throws java.io.IOException {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            com.googlecode.mp4parser.h264.model.SeqParameterSet r1 = read(r0)
            return r1
    }

    private static com.googlecode.mp4parser.h264.model.HRDParameters readHRDParameters(com.googlecode.mp4parser.h264.read.CAVLCReader r4) throws java.io.IOException {
            com.googlecode.mp4parser.h264.model.HRDParameters r0 = new com.googlecode.mp4parser.h264.model.HRDParameters
            r0.<init>()
            java.lang.String r1 = "SPS: cpb_cnt_minus1"
            int r1 = r4.readUE(r1)
            r0.cpb_cnt_minus1 = r1
            r1 = 4
            java.lang.String r2 = "HRD: bit_rate_scale"
            long r2 = r4.readNBit(r1, r2)
            int r3 = (int) r2
            r0.bit_rate_scale = r3
            java.lang.String r2 = "HRD: cpb_size_scale"
            long r1 = r4.readNBit(r1, r2)
            int r2 = (int) r1
            r0.cpb_size_scale = r2
            int r1 = r0.cpb_cnt_minus1
            int r2 = r1 + 1
            int[] r2 = new int[r2]
            r0.bit_rate_value_minus1 = r2
            int r2 = r1 + 1
            int[] r2 = new int[r2]
            r0.cpb_size_value_minus1 = r2
            int r1 = r1 + 1
            boolean[] r1 = new boolean[r1]
            r0.cbr_flag = r1
            r1 = 0
        L35:
            int r2 = r0.cpb_cnt_minus1
            if (r1 <= r2) goto L5f
            r1 = 5
            java.lang.String r2 = "HRD: initial_cpb_removal_delay_length_minus1"
            long r2 = r4.readNBit(r1, r2)
            int r3 = (int) r2
            r0.initial_cpb_removal_delay_length_minus1 = r3
            java.lang.String r2 = "HRD: cpb_removal_delay_length_minus1"
            long r2 = r4.readNBit(r1, r2)
            int r3 = (int) r2
            r0.cpb_removal_delay_length_minus1 = r3
            java.lang.String r2 = "HRD: dpb_output_delay_length_minus1"
            long r2 = r4.readNBit(r1, r2)
            int r3 = (int) r2
            r0.dpb_output_delay_length_minus1 = r3
            java.lang.String r2 = "HRD: time_offset_length"
            long r1 = r4.readNBit(r1, r2)
            int r4 = (int) r1
            r0.time_offset_length = r4
            return r0
        L5f:
            int[] r2 = r0.bit_rate_value_minus1
            java.lang.String r3 = "HRD: bit_rate_value_minus1"
            int r3 = r4.readUE(r3)
            r2[r1] = r3
            int[] r2 = r0.cpb_size_value_minus1
            java.lang.String r3 = "HRD: cpb_size_value_minus1"
            int r3 = r4.readUE(r3)
            r2[r1] = r3
            boolean[] r2 = r0.cbr_flag
            java.lang.String r3 = "HRD: cbr_flag"
            boolean r3 = r4.readBool(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L35
    }

    private static void readScalingListMatrix(com.googlecode.mp4parser.h264.read.CAVLCReader r4, com.googlecode.mp4parser.h264.model.SeqParameterSet r5) throws java.io.IOException {
            com.googlecode.mp4parser.h264.model.ScalingMatrix r0 = new com.googlecode.mp4parser.h264.model.ScalingMatrix
            r0.<init>()
            r5.scalingMatrix = r0
            r0 = 0
        L8:
            r1 = 8
            if (r0 < r1) goto Ld
            return
        Ld:
            java.lang.String r2 = "SPS: seqScalingListPresentFlag"
            boolean r2 = r4.readBool(r2)
            if (r2 == 0) goto L35
            com.googlecode.mp4parser.h264.model.ScalingMatrix r2 = r5.scalingMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r3 = new com.googlecode.mp4parser.h264.model.ScalingList[r1]
            r2.ScalingList4x4 = r3
            com.googlecode.mp4parser.h264.model.ScalingList[] r1 = new com.googlecode.mp4parser.h264.model.ScalingList[r1]
            r2.ScalingList8x8 = r1
            r2 = 6
            if (r0 >= r2) goto L2b
            r1 = 16
            com.googlecode.mp4parser.h264.model.ScalingList r1 = com.googlecode.mp4parser.h264.model.ScalingList.read(r4, r1)
            r3[r0] = r1
            goto L35
        L2b:
            int r2 = r0 + (-6)
            r3 = 64
            com.googlecode.mp4parser.h264.model.ScalingList r3 = com.googlecode.mp4parser.h264.model.ScalingList.read(r4, r3)
            r1[r2] = r3
        L35:
            int r0 = r0 + 1
            goto L8
    }

    private void writeHRDParameters(com.googlecode.mp4parser.h264.model.HRDParameters r5, com.googlecode.mp4parser.h264.write.CAVLCWriter r6) throws java.io.IOException {
            r4 = this;
            int r0 = r5.cpb_cnt_minus1
            java.lang.String r1 = "HRD: cpb_cnt_minus1"
            r6.writeUE(r0, r1)
            int r0 = r5.bit_rate_scale
            long r0 = (long) r0
            r2 = 4
            java.lang.String r3 = "HRD: bit_rate_scale"
            r6.writeNBit(r0, r2, r3)
            int r0 = r5.cpb_size_scale
            long r0 = (long) r0
            java.lang.String r3 = "HRD: cpb_size_scale"
            r6.writeNBit(r0, r2, r3)
            r0 = 0
        L19:
            int r1 = r5.cpb_cnt_minus1
            if (r0 <= r1) goto L3f
            int r0 = r5.initial_cpb_removal_delay_length_minus1
            long r0 = (long) r0
            r2 = 5
            java.lang.String r3 = "HRD: initial_cpb_removal_delay_length_minus1"
            r6.writeNBit(r0, r2, r3)
            int r0 = r5.cpb_removal_delay_length_minus1
            long r0 = (long) r0
            java.lang.String r3 = "HRD: cpb_removal_delay_length_minus1"
            r6.writeNBit(r0, r2, r3)
            int r0 = r5.dpb_output_delay_length_minus1
            long r0 = (long) r0
            java.lang.String r3 = "HRD: dpb_output_delay_length_minus1"
            r6.writeNBit(r0, r2, r3)
            int r5 = r5.time_offset_length
            long r0 = (long) r5
            java.lang.String r5 = "HRD: time_offset_length"
            r6.writeNBit(r0, r2, r5)
            return
        L3f:
            int[] r1 = r5.bit_rate_value_minus1
            r1 = r1[r0]
            java.lang.String r2 = "HRD: "
            r6.writeUE(r1, r2)
            int[] r1 = r5.cpb_size_value_minus1
            r1 = r1[r0]
            r6.writeUE(r1, r2)
            boolean[] r1 = r5.cbr_flag
            boolean r1 = r1[r0]
            r6.writeBool(r1, r2)
            int r0 = r0 + 1
            goto L19
    }

    private void writeVUIParameters(com.googlecode.mp4parser.h264.model.VUIParameters r6, com.googlecode.mp4parser.h264.write.CAVLCWriter r7) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6.aspect_ratio_info_present_flag
            java.lang.String r1 = "VUI: aspect_ratio_info_present_flag"
            r7.writeBool(r0, r1)
            boolean r0 = r6.aspect_ratio_info_present_flag
            r1 = 8
            if (r0 == 0) goto L31
            com.googlecode.mp4parser.h264.model.AspectRatio r0 = r6.aspect_ratio
            int r0 = r0.getValue()
            long r2 = (long) r0
            java.lang.String r0 = "VUI: aspect_ratio"
            r7.writeNBit(r2, r1, r0)
            com.googlecode.mp4parser.h264.model.AspectRatio r0 = r6.aspect_ratio
            com.googlecode.mp4parser.h264.model.AspectRatio r2 = com.googlecode.mp4parser.h264.model.AspectRatio.Extended_SAR
            if (r0 != r2) goto L31
            int r0 = r6.sar_width
            long r2 = (long) r0
            r0 = 16
            java.lang.String r4 = "VUI: sar_width"
            r7.writeNBit(r2, r0, r4)
            int r2 = r6.sar_height
            long r2 = (long) r2
            java.lang.String r4 = "VUI: sar_height"
            r7.writeNBit(r2, r0, r4)
        L31:
            boolean r0 = r6.overscan_info_present_flag
            java.lang.String r2 = "VUI: overscan_info_present_flag"
            r7.writeBool(r0, r2)
            boolean r0 = r6.overscan_info_present_flag
            if (r0 == 0) goto L43
            boolean r0 = r6.overscan_appropriate_flag
            java.lang.String r2 = "VUI: overscan_appropriate_flag"
            r7.writeBool(r0, r2)
        L43:
            boolean r0 = r6.video_signal_type_present_flag
            java.lang.String r2 = "VUI: video_signal_type_present_flag"
            r7.writeBool(r0, r2)
            boolean r0 = r6.video_signal_type_present_flag
            if (r0 == 0) goto L81
            int r0 = r6.video_format
            long r2 = (long) r0
            r0 = 3
            java.lang.String r4 = "VUI: video_format"
            r7.writeNBit(r2, r0, r4)
            boolean r0 = r6.video_full_range_flag
            java.lang.String r2 = "VUI: video_full_range_flag"
            r7.writeBool(r0, r2)
            boolean r0 = r6.colour_description_present_flag
            java.lang.String r2 = "VUI: colour_description_present_flag"
            r7.writeBool(r0, r2)
            boolean r0 = r6.colour_description_present_flag
            if (r0 == 0) goto L81
            int r0 = r6.colour_primaries
            long r2 = (long) r0
            java.lang.String r0 = "VUI: colour_primaries"
            r7.writeNBit(r2, r1, r0)
            int r0 = r6.transfer_characteristics
            long r2 = (long) r0
            java.lang.String r0 = "VUI: transfer_characteristics"
            r7.writeNBit(r2, r1, r0)
            int r0 = r6.matrix_coefficients
            long r2 = (long) r0
            java.lang.String r0 = "VUI: matrix_coefficients"
            r7.writeNBit(r2, r1, r0)
        L81:
            boolean r0 = r6.chroma_loc_info_present_flag
            java.lang.String r1 = "VUI: chroma_loc_info_present_flag"
            r7.writeBool(r0, r1)
            boolean r0 = r6.chroma_loc_info_present_flag
            if (r0 == 0) goto L9a
            int r0 = r6.chroma_sample_loc_type_top_field
            java.lang.String r1 = "VUI: chroma_sample_loc_type_top_field"
            r7.writeUE(r0, r1)
            int r0 = r6.chroma_sample_loc_type_bottom_field
            java.lang.String r1 = "VUI: chroma_sample_loc_type_bottom_field"
            r7.writeUE(r0, r1)
        L9a:
            boolean r0 = r6.timing_info_present_flag
            java.lang.String r1 = "VUI: timing_info_present_flag"
            r7.writeBool(r0, r1)
            boolean r0 = r6.timing_info_present_flag
            if (r0 == 0) goto Lbe
            int r0 = r6.num_units_in_tick
            long r0 = (long) r0
            r2 = 32
            java.lang.String r3 = "VUI: num_units_in_tick"
            r7.writeNBit(r0, r2, r3)
            int r0 = r6.time_scale
            long r0 = (long) r0
            java.lang.String r3 = "VUI: time_scale"
            r7.writeNBit(r0, r2, r3)
            boolean r0 = r6.fixed_frame_rate_flag
            java.lang.String r1 = "VUI: fixed_frame_rate_flag"
            r7.writeBool(r0, r1)
        Lbe:
            com.googlecode.mp4parser.h264.model.HRDParameters r0 = r6.nalHRDParams
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc6
            r0 = 1
            goto Lc7
        Lc6:
            r0 = 0
        Lc7:
            java.lang.String r3 = "VUI: "
            r7.writeBool(r0, r3)
            com.googlecode.mp4parser.h264.model.HRDParameters r0 = r6.nalHRDParams
            if (r0 == 0) goto Ld3
            r5.writeHRDParameters(r0, r7)
        Ld3:
            com.googlecode.mp4parser.h264.model.HRDParameters r0 = r6.vclHRDParams
            if (r0 == 0) goto Ld9
            r0 = 1
            goto Lda
        Ld9:
            r0 = 0
        Lda:
            r7.writeBool(r0, r3)
            com.googlecode.mp4parser.h264.model.HRDParameters r0 = r6.vclHRDParams
            if (r0 == 0) goto Le4
            r5.writeHRDParameters(r0, r7)
        Le4:
            com.googlecode.mp4parser.h264.model.HRDParameters r0 = r6.nalHRDParams
            if (r0 != 0) goto Lec
            com.googlecode.mp4parser.h264.model.HRDParameters r0 = r6.vclHRDParams
            if (r0 == 0) goto Lf3
        Lec:
            boolean r0 = r6.low_delay_hrd_flag
            java.lang.String r4 = "VUI: low_delay_hrd_flag"
            r7.writeBool(r0, r4)
        Lf3:
            boolean r0 = r6.pic_struct_present_flag
            java.lang.String r4 = "VUI: pic_struct_present_flag"
            r7.writeBool(r0, r4)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            if (r0 == 0) goto Lff
            goto L100
        Lff:
            r1 = 0
        L100:
            r7.writeBool(r1, r3)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            if (r0 == 0) goto L144
            boolean r0 = r0.motion_vectors_over_pic_boundaries_flag
            java.lang.String r1 = "VUI: motion_vectors_over_pic_boundaries_flag"
            r7.writeBool(r0, r1)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.max_bytes_per_pic_denom
            java.lang.String r1 = "VUI: max_bytes_per_pic_denom"
            r7.writeUE(r0, r1)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.max_bits_per_mb_denom
            java.lang.String r1 = "VUI: max_bits_per_mb_denom"
            r7.writeUE(r0, r1)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.log2_max_mv_length_horizontal
            java.lang.String r1 = "VUI: log2_max_mv_length_horizontal"
            r7.writeUE(r0, r1)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.log2_max_mv_length_vertical
            java.lang.String r1 = "VUI: log2_max_mv_length_vertical"
            r7.writeUE(r0, r1)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.num_reorder_frames
            java.lang.String r1 = "VUI: num_reorder_frames"
            r7.writeUE(r0, r1)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r6 = r6.bitstreamRestriction
            int r6 = r6.max_dec_frame_buffering
            java.lang.String r0 = "VUI: max_dec_frame_buffering"
            r7.writeUE(r6, r0)
        L144:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SeqParameterSet{ \n        pic_order_cnt_type="
            r0.<init>(r1)
            int r1 = r2.pic_order_cnt_type
            r0.append(r1)
            java.lang.String r1 = ", \n        field_pic_flag="
            r0.append(r1)
            boolean r1 = r2.field_pic_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        delta_pic_order_always_zero_flag="
            r0.append(r1)
            boolean r1 = r2.delta_pic_order_always_zero_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        weighted_pred_flag="
            r0.append(r1)
            boolean r1 = r2.weighted_pred_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        weighted_bipred_idc="
            r0.append(r1)
            int r1 = r2.weighted_bipred_idc
            r0.append(r1)
            java.lang.String r1 = ", \n        entropy_coding_mode_flag="
            r0.append(r1)
            boolean r1 = r2.entropy_coding_mode_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        mb_adaptive_frame_field_flag="
            r0.append(r1)
            boolean r1 = r2.mb_adaptive_frame_field_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        direct_8x8_inference_flag="
            r0.append(r1)
            boolean r1 = r2.direct_8x8_inference_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        chroma_format_idc="
            r0.append(r1)
            com.googlecode.mp4parser.h264.model.ChromaFormat r1 = r2.chroma_format_idc
            r0.append(r1)
            java.lang.String r1 = ", \n        log2_max_frame_num_minus4="
            r0.append(r1)
            int r1 = r2.log2_max_frame_num_minus4
            r0.append(r1)
            java.lang.String r1 = ", \n        log2_max_pic_order_cnt_lsb_minus4="
            r0.append(r1)
            int r1 = r2.log2_max_pic_order_cnt_lsb_minus4
            r0.append(r1)
            java.lang.String r1 = ", \n        pic_height_in_map_units_minus1="
            r0.append(r1)
            int r1 = r2.pic_height_in_map_units_minus1
            r0.append(r1)
            java.lang.String r1 = ", \n        pic_width_in_mbs_minus1="
            r0.append(r1)
            int r1 = r2.pic_width_in_mbs_minus1
            r0.append(r1)
            java.lang.String r1 = ", \n        bit_depth_luma_minus8="
            r0.append(r1)
            int r1 = r2.bit_depth_luma_minus8
            r0.append(r1)
            java.lang.String r1 = ", \n        bit_depth_chroma_minus8="
            r0.append(r1)
            int r1 = r2.bit_depth_chroma_minus8
            r0.append(r1)
            java.lang.String r1 = ", \n        qpprime_y_zero_transform_bypass_flag="
            r0.append(r1)
            boolean r1 = r2.qpprime_y_zero_transform_bypass_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        profile_idc="
            r0.append(r1)
            int r1 = r2.profile_idc
            r0.append(r1)
            java.lang.String r1 = ", \n        constraint_set_0_flag="
            r0.append(r1)
            boolean r1 = r2.constraint_set_0_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        constraint_set_1_flag="
            r0.append(r1)
            boolean r1 = r2.constraint_set_1_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        constraint_set_2_flag="
            r0.append(r1)
            boolean r1 = r2.constraint_set_2_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        constraint_set_3_flag="
            r0.append(r1)
            boolean r1 = r2.constraint_set_3_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        constraint_set_4_flag="
            r0.append(r1)
            boolean r1 = r2.constraint_set_4_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        constraint_set_5_flag="
            r0.append(r1)
            boolean r1 = r2.constraint_set_5_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        level_idc="
            r0.append(r1)
            int r1 = r2.level_idc
            r0.append(r1)
            java.lang.String r1 = ", \n        seq_parameter_set_id="
            r0.append(r1)
            int r1 = r2.seq_parameter_set_id
            r0.append(r1)
            java.lang.String r1 = ", \n        residual_color_transform_flag="
            r0.append(r1)
            boolean r1 = r2.residual_color_transform_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        offset_for_non_ref_pic="
            r0.append(r1)
            int r1 = r2.offset_for_non_ref_pic
            r0.append(r1)
            java.lang.String r1 = ", \n        offset_for_top_to_bottom_field="
            r0.append(r1)
            int r1 = r2.offset_for_top_to_bottom_field
            r0.append(r1)
            java.lang.String r1 = ", \n        num_ref_frames="
            r0.append(r1)
            int r1 = r2.num_ref_frames
            r0.append(r1)
            java.lang.String r1 = ", \n        gaps_in_frame_num_value_allowed_flag="
            r0.append(r1)
            boolean r1 = r2.gaps_in_frame_num_value_allowed_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        frame_mbs_only_flag="
            r0.append(r1)
            boolean r1 = r2.frame_mbs_only_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        frame_cropping_flag="
            r0.append(r1)
            boolean r1 = r2.frame_cropping_flag
            r0.append(r1)
            java.lang.String r1 = ", \n        frame_crop_left_offset="
            r0.append(r1)
            int r1 = r2.frame_crop_left_offset
            r0.append(r1)
            java.lang.String r1 = ", \n        frame_crop_right_offset="
            r0.append(r1)
            int r1 = r2.frame_crop_right_offset
            r0.append(r1)
            java.lang.String r1 = ", \n        frame_crop_top_offset="
            r0.append(r1)
            int r1 = r2.frame_crop_top_offset
            r0.append(r1)
            java.lang.String r1 = ", \n        frame_crop_bottom_offset="
            r0.append(r1)
            int r1 = r2.frame_crop_bottom_offset
            r0.append(r1)
            java.lang.String r1 = ", \n        offsetForRefFrame="
            r0.append(r1)
            int[] r1 = r2.offsetForRefFrame
            r0.append(r1)
            java.lang.String r1 = ", \n        vuiParams="
            r0.append(r1)
            com.googlecode.mp4parser.h264.model.VUIParameters r1 = r2.vuiParams
            r0.append(r1)
            java.lang.String r1 = ", \n        scalingMatrix="
            r0.append(r1)
            com.googlecode.mp4parser.h264.model.ScalingMatrix r1 = r2.scalingMatrix
            r0.append(r1)
            java.lang.String r1 = ", \n        num_ref_frames_in_pic_order_cnt_cycle="
            r0.append(r1)
            int r1 = r2.num_ref_frames_in_pic_order_cnt_cycle
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.h264.model.BitstreamElement
    public void write(java.io.OutputStream r9) throws java.io.IOException {
            r8 = this;
            com.googlecode.mp4parser.h264.write.CAVLCWriter r0 = new com.googlecode.mp4parser.h264.write.CAVLCWriter
            r0.<init>(r9)
            int r9 = r8.profile_idc
            long r1 = (long) r9
            r9 = 8
            java.lang.String r3 = "SPS: profile_idc"
            r0.writeNBit(r1, r9, r3)
            boolean r1 = r8.constraint_set_0_flag
            java.lang.String r2 = "SPS: constraint_set_0_flag"
            r0.writeBool(r1, r2)
            boolean r1 = r8.constraint_set_1_flag
            java.lang.String r2 = "SPS: constraint_set_1_flag"
            r0.writeBool(r1, r2)
            boolean r1 = r8.constraint_set_2_flag
            java.lang.String r2 = "SPS: constraint_set_2_flag"
            r0.writeBool(r1, r2)
            boolean r1 = r8.constraint_set_3_flag
            java.lang.String r2 = "SPS: constraint_set_3_flag"
            r0.writeBool(r1, r2)
            r1 = 0
            r3 = 4
            java.lang.String r4 = "SPS: reserved"
            r0.writeNBit(r1, r3, r4)
            int r1 = r8.level_idc
            long r1 = (long) r1
            java.lang.String r3 = "SPS: level_idc"
            r0.writeNBit(r1, r9, r3)
            int r1 = r8.seq_parameter_set_id
            java.lang.String r2 = "SPS: seq_parameter_set_id"
            r0.writeUE(r1, r2)
            int r1 = r8.profile_idc
            r2 = 0
            r3 = 1
            java.lang.String r4 = "SPS: "
            r5 = 100
            if (r1 == r5) goto L58
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L58
            r5 = 122(0x7a, float:1.71E-43)
            if (r1 == r5) goto L58
            r5 = 144(0x90, float:2.02E-43)
            if (r1 != r5) goto Ld2
        L58:
            com.googlecode.mp4parser.h264.model.ChromaFormat r1 = r8.chroma_format_idc
            int r1 = r1.getId()
            java.lang.String r5 = "SPS: chroma_format_idc"
            r0.writeUE(r1, r5)
            com.googlecode.mp4parser.h264.model.ChromaFormat r1 = r8.chroma_format_idc
            com.googlecode.mp4parser.h264.model.ChromaFormat r5 = com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_444
            if (r1 != r5) goto L70
            boolean r1 = r8.residual_color_transform_flag
            java.lang.String r5 = "SPS: residual_color_transform_flag"
            r0.writeBool(r1, r5)
        L70:
            int r1 = r8.bit_depth_luma_minus8
            r0.writeUE(r1, r4)
            int r1 = r8.bit_depth_chroma_minus8
            r0.writeUE(r1, r4)
            boolean r1 = r8.qpprime_y_zero_transform_bypass_flag
            java.lang.String r5 = "SPS: qpprime_y_zero_transform_bypass_flag"
            r0.writeBool(r1, r5)
            com.googlecode.mp4parser.h264.model.ScalingMatrix r1 = r8.scalingMatrix
            if (r1 == 0) goto L87
            r1 = 1
            goto L88
        L87:
            r1 = 0
        L88:
            r0.writeBool(r1, r4)
            com.googlecode.mp4parser.h264.model.ScalingMatrix r1 = r8.scalingMatrix
            if (r1 == 0) goto Ld2
            r1 = 0
        L90:
            if (r1 < r9) goto L93
            goto Ld2
        L93:
            r5 = 6
            if (r1 >= r5) goto Lb2
            com.googlecode.mp4parser.h264.model.ScalingMatrix r5 = r8.scalingMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r5 = r5.ScalingList4x4
            r5 = r5[r1]
            if (r5 == 0) goto La0
            r5 = 1
            goto La1
        La0:
            r5 = 0
        La1:
            r0.writeBool(r5, r4)
            com.googlecode.mp4parser.h264.model.ScalingMatrix r5 = r8.scalingMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r5 = r5.ScalingList4x4
            r6 = r5[r1]
            if (r6 == 0) goto Lcf
            r5 = r5[r1]
            r5.write(r0)
            goto Lcf
        Lb2:
            com.googlecode.mp4parser.h264.model.ScalingMatrix r5 = r8.scalingMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r5 = r5.ScalingList8x8
            int r6 = r1 + (-6)
            r5 = r5[r6]
            if (r5 == 0) goto Lbe
            r5 = 1
            goto Lbf
        Lbe:
            r5 = 0
        Lbf:
            r0.writeBool(r5, r4)
            com.googlecode.mp4parser.h264.model.ScalingMatrix r5 = r8.scalingMatrix
            com.googlecode.mp4parser.h264.model.ScalingList[] r5 = r5.ScalingList8x8
            r7 = r5[r6]
            if (r7 == 0) goto Lcf
            r5 = r5[r6]
            r5.write(r0)
        Lcf:
            int r1 = r1 + 1
            goto L90
        Ld2:
            int r9 = r8.log2_max_frame_num_minus4
            java.lang.String r1 = "SPS: log2_max_frame_num_minus4"
            r0.writeUE(r9, r1)
            int r9 = r8.pic_order_cnt_type
            java.lang.String r1 = "SPS: pic_order_cnt_type"
            r0.writeUE(r9, r1)
            int r9 = r8.pic_order_cnt_type
            if (r9 != 0) goto Lec
            int r9 = r8.log2_max_pic_order_cnt_lsb_minus4
            java.lang.String r1 = "SPS: log2_max_pic_order_cnt_lsb_minus4"
            r0.writeUE(r9, r1)
            goto L118
        Lec:
            if (r9 != r3) goto L118
            boolean r9 = r8.delta_pic_order_always_zero_flag
            java.lang.String r1 = "SPS: delta_pic_order_always_zero_flag"
            r0.writeBool(r9, r1)
            int r9 = r8.offset_for_non_ref_pic
            java.lang.String r1 = "SPS: offset_for_non_ref_pic"
            r0.writeSE(r9, r1)
            int r9 = r8.offset_for_top_to_bottom_field
            java.lang.String r1 = "SPS: offset_for_top_to_bottom_field"
            r0.writeSE(r9, r1)
            int[] r9 = r8.offsetForRefFrame
            int r9 = r9.length
            r0.writeUE(r9, r4)
            r9 = 0
        L10a:
            int[] r1 = r8.offsetForRefFrame
            int r5 = r1.length
            if (r9 < r5) goto L110
            goto L118
        L110:
            r1 = r1[r9]
            r0.writeSE(r1, r4)
            int r9 = r9 + 1
            goto L10a
        L118:
            int r9 = r8.num_ref_frames
            java.lang.String r1 = "SPS: num_ref_frames"
            r0.writeUE(r9, r1)
            boolean r9 = r8.gaps_in_frame_num_value_allowed_flag
            java.lang.String r1 = "SPS: gaps_in_frame_num_value_allowed_flag"
            r0.writeBool(r9, r1)
            int r9 = r8.pic_width_in_mbs_minus1
            java.lang.String r1 = "SPS: pic_width_in_mbs_minus1"
            r0.writeUE(r9, r1)
            int r9 = r8.pic_height_in_map_units_minus1
            java.lang.String r1 = "SPS: pic_height_in_map_units_minus1"
            r0.writeUE(r9, r1)
            boolean r9 = r8.frame_mbs_only_flag
            java.lang.String r1 = "SPS: frame_mbs_only_flag"
            r0.writeBool(r9, r1)
            boolean r9 = r8.frame_mbs_only_flag
            if (r9 != 0) goto L146
            boolean r9 = r8.mb_adaptive_frame_field_flag
            java.lang.String r1 = "SPS: mb_adaptive_frame_field_flag"
            r0.writeBool(r9, r1)
        L146:
            boolean r9 = r8.direct_8x8_inference_flag
            java.lang.String r1 = "SPS: direct_8x8_inference_flag"
            r0.writeBool(r9, r1)
            boolean r9 = r8.frame_cropping_flag
            java.lang.String r1 = "SPS: frame_cropping_flag"
            r0.writeBool(r9, r1)
            boolean r9 = r8.frame_cropping_flag
            if (r9 == 0) goto L174
            int r9 = r8.frame_crop_left_offset
            java.lang.String r1 = "SPS: frame_crop_left_offset"
            r0.writeUE(r9, r1)
            int r9 = r8.frame_crop_right_offset
            java.lang.String r1 = "SPS: frame_crop_right_offset"
            r0.writeUE(r9, r1)
            int r9 = r8.frame_crop_top_offset
            java.lang.String r1 = "SPS: frame_crop_top_offset"
            r0.writeUE(r9, r1)
            int r9 = r8.frame_crop_bottom_offset
            java.lang.String r1 = "SPS: frame_crop_bottom_offset"
            r0.writeUE(r9, r1)
        L174:
            com.googlecode.mp4parser.h264.model.VUIParameters r9 = r8.vuiParams
            if (r9 == 0) goto L179
            r2 = 1
        L179:
            r0.writeBool(r2, r4)
            com.googlecode.mp4parser.h264.model.VUIParameters r9 = r8.vuiParams
            if (r9 == 0) goto L183
            r8.writeVUIParameters(r9, r0)
        L183:
            r0.writeTrailingBits()
            return
    }
}
