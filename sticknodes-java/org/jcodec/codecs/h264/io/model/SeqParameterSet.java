package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public class SeqParameterSet {
    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public org.jcodec.common.model.ColorSpace chroma_format_idc;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public boolean constraint_set_4_flag;
    public boolean constraint_set_5_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean direct_8x8_inference_flag;
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
    public boolean residual_color_transform_flag;
    public org.jcodec.codecs.h264.io.model.ScalingMatrix scalingMatrix;
    public int seq_parameter_set_id;
    public org.jcodec.codecs.h264.io.model.VUIParameters vuiParams;

    public SeqParameterSet() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int fromColor(org.jcodec.common.model.ColorSpace r1) {
            org.jcodec.common.model.ColorSpace r0 = org.jcodec.common.model.ColorSpace.MONO
            if (r1 != r0) goto L6
            r1 = 0
            return r1
        L6:
            org.jcodec.common.model.ColorSpace r0 = org.jcodec.common.model.ColorSpace.YUV420J
            if (r1 != r0) goto Lc
            r1 = 1
            return r1
        Lc:
            org.jcodec.common.model.ColorSpace r0 = org.jcodec.common.model.ColorSpace.YUV422
            if (r1 != r0) goto L12
            r1 = 2
            return r1
        L12:
            org.jcodec.common.model.ColorSpace r0 = org.jcodec.common.model.ColorSpace.YUV444
            if (r1 != r0) goto L18
            r1 = 3
            return r1
        L18:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Colorspace not supported"
            r1.<init>(r0)
            throw r1
    }

    public static org.jcodec.common.model.ColorSpace getColor(int r1) {
            if (r1 == 0) goto L1c
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 != r0) goto Le
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV444
            return r1
        Le:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Colorspace not supported"
            r1.<init>(r0)
            throw r1
        L16:
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV422
            return r1
        L19:
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV420J
            return r1
        L1c:
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.MONO
            return r1
    }

    public static org.jcodec.codecs.h264.io.model.SeqParameterSet read(java.nio.ByteBuffer r5) {
            org.jcodec.common.io.BitReader r5 = org.jcodec.common.io.BitReader.createBitReader(r5)
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = new org.jcodec.codecs.h264.io.model.SeqParameterSet
            r0.<init>()
            r1 = 8
            java.lang.String r2 = "SPS: profile_idc"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r5, r1, r2)
            r0.profile_idc = r2
            java.lang.String r2 = "SPS: constraint_set_0_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r2)
            r0.constraint_set_0_flag = r2
            java.lang.String r2 = "SPS: constraint_set_1_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r2)
            r0.constraint_set_1_flag = r2
            java.lang.String r2 = "SPS: constraint_set_2_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r2)
            r0.constraint_set_2_flag = r2
            java.lang.String r2 = "SPS: constraint_set_3_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r2)
            r0.constraint_set_3_flag = r2
            java.lang.String r2 = "SPS: constraint_set_4_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r2)
            r0.constraint_set_4_flag = r2
            java.lang.String r2 = "SPS: constraint_set_5_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r2)
            r0.constraint_set_5_flag = r2
            r2 = 2
            java.lang.String r3 = "SPS: reserved_zero_2bits"
            org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r5, r2, r3)
            java.lang.String r2 = "SPS: level_idc"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r5, r1, r2)
            r0.level_idc = r1
            java.lang.String r1 = "SPS: seq_parameter_set_id"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.seq_parameter_set_id = r1
            int r1 = r0.profile_idc
            r2 = 100
            if (r1 == r2) goto L71
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L71
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L71
            r2 = 144(0x90, float:2.02E-43)
            if (r1 != r2) goto L6c
            goto L71
        L6c:
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV420J
            r0.chroma_format_idc = r1
            goto Lac
        L71:
            java.lang.String r1 = "SPS: chroma_format_idc"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            org.jcodec.common.model.ColorSpace r1 = getColor(r1)
            r0.chroma_format_idc = r1
            org.jcodec.common.model.ColorSpace r2 = org.jcodec.common.model.ColorSpace.YUV444
            if (r1 != r2) goto L89
            java.lang.String r1 = "SPS: residual_color_transform_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.residual_color_transform_flag = r1
        L89:
            java.lang.String r1 = "SPS: bit_depth_luma_minus8"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.bit_depth_luma_minus8 = r1
            java.lang.String r1 = "SPS: bit_depth_chroma_minus8"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.bit_depth_chroma_minus8 = r1
            java.lang.String r1 = "SPS: qpprime_y_zero_transform_bypass_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.qpprime_y_zero_transform_bypass_flag = r1
            java.lang.String r1 = "SPS: seq_scaling_matrix_present_lag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            if (r1 == 0) goto Lac
            readScalingListMatrix(r5, r0)
        Lac:
            java.lang.String r1 = "SPS: log2_max_frame_num_minus4"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.log2_max_frame_num_minus4 = r1
            java.lang.String r1 = "SPS: pic_order_cnt_type"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.pic_order_cnt_type = r1
            if (r1 != 0) goto Lc7
            java.lang.String r1 = "SPS: log2_max_pic_order_cnt_lsb_minus4"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.log2_max_pic_order_cnt_lsb_minus4 = r1
            goto L114
        Lc7:
            r2 = 1
            if (r1 != r2) goto L114
            java.lang.String r1 = "SPS: delta_pic_order_always_zero_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.delta_pic_order_always_zero_flag = r1
            java.lang.String r1 = "SPS: offset_for_non_ref_pic"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r5, r1)
            r0.offset_for_non_ref_pic = r1
            java.lang.String r1 = "SPS: offset_for_top_to_bottom_field"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r5, r1)
            r0.offset_for_top_to_bottom_field = r1
            java.lang.String r1 = "SPS: num_ref_frames_in_pic_order_cnt_cycle"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.num_ref_frames_in_pic_order_cnt_cycle = r1
            int[] r1 = new int[r1]
            r0.offsetForRefFrame = r1
            r1 = 0
        Lef:
            int r2 = r0.num_ref_frames_in_pic_order_cnt_cycle
            if (r1 >= r2) goto L114
            int[] r2 = r0.offsetForRefFrame
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SPS: offsetForRefFrame ["
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r5, r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lef
        L114:
            java.lang.String r1 = "SPS: num_ref_frames"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.num_ref_frames = r1
            java.lang.String r1 = "SPS: gaps_in_frame_num_value_allowed_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.gaps_in_frame_num_value_allowed_flag = r1
            java.lang.String r1 = "SPS: pic_width_in_mbs_minus1"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.pic_width_in_mbs_minus1 = r1
            java.lang.String r1 = "SPS: pic_height_in_map_units_minus1"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.pic_height_in_map_units_minus1 = r1
            java.lang.String r1 = "SPS: frame_mbs_only_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.frame_mbs_only_flag = r1
            if (r1 != 0) goto L146
            java.lang.String r1 = "SPS: mb_adaptive_frame_field_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.mb_adaptive_frame_field_flag = r1
        L146:
            java.lang.String r1 = "SPS: direct_8x8_inference_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.direct_8x8_inference_flag = r1
            java.lang.String r1 = "SPS: frame_cropping_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            r0.frame_cropping_flag = r1
            if (r1 == 0) goto L178
            java.lang.String r1 = "SPS: frame_crop_left_offset"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.frame_crop_left_offset = r1
            java.lang.String r1 = "SPS: frame_crop_right_offset"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.frame_crop_right_offset = r1
            java.lang.String r1 = "SPS: frame_crop_top_offset"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.frame_crop_top_offset = r1
            java.lang.String r1 = "SPS: frame_crop_bottom_offset"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r5, r1)
            r0.frame_crop_bottom_offset = r1
        L178:
            java.lang.String r1 = "SPS: vui_parameters_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r5, r1)
            if (r1 == 0) goto L186
            org.jcodec.codecs.h264.io.model.VUIParameters r5 = readVUIParameters(r5)
            r0.vuiParams = r5
        L186:
            return r0
    }

    private static org.jcodec.codecs.h264.io.model.HRDParameters readHRDParameters(org.jcodec.common.io.BitReader r4) {
            org.jcodec.codecs.h264.io.model.HRDParameters r0 = new org.jcodec.codecs.h264.io.model.HRDParameters
            r0.<init>()
            java.lang.String r1 = "SPS: cpb_cnt_minus1"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r1)
            r0.cpb_cnt_minus1 = r1
            r1 = 4
            java.lang.String r2 = "HRD: bit_rate_scale"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.bit_rate_scale = r2
            java.lang.String r2 = "HRD: cpb_size_scale"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.cpb_size_scale = r1
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
        L33:
            int r2 = r0.cpb_cnt_minus1
            if (r1 > r2) goto L58
            int[] r2 = r0.bit_rate_value_minus1
            java.lang.String r3 = "HRD: bit_rate_value_minus1"
            int r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r3)
            r2[r1] = r3
            int[] r2 = r0.cpb_size_value_minus1
            java.lang.String r3 = "HRD: cpb_size_value_minus1"
            int r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r3)
            r2[r1] = r3
            boolean[] r2 = r0.cbr_flag
            java.lang.String r3 = "HRD: cbr_flag"
            boolean r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L33
        L58:
            r1 = 5
            java.lang.String r2 = "HRD: initial_cpb_removal_delay_length_minus1"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.initial_cpb_removal_delay_length_minus1 = r2
            java.lang.String r2 = "HRD: cpb_removal_delay_length_minus1"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.cpb_removal_delay_length_minus1 = r2
            java.lang.String r2 = "HRD: dpb_output_delay_length_minus1"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.dpb_output_delay_length_minus1 = r2
            java.lang.String r2 = "HRD: time_offset_length"
            int r4 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.time_offset_length = r4
            return r0
    }

    private static void readScalingListMatrix(org.jcodec.common.io.BitReader r4, org.jcodec.codecs.h264.io.model.SeqParameterSet r5) {
            org.jcodec.codecs.h264.io.model.ScalingMatrix r0 = new org.jcodec.codecs.h264.io.model.ScalingMatrix
            r0.<init>()
            r5.scalingMatrix = r0
            r0 = 0
        L8:
            r1 = 8
            if (r0 >= r1) goto L37
            java.lang.String r2 = "SPS: seqScalingListPresentFlag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r2)
            if (r2 == 0) goto L34
            org.jcodec.codecs.h264.io.model.ScalingMatrix r2 = r5.scalingMatrix
            org.jcodec.codecs.h264.io.model.ScalingList[] r3 = new org.jcodec.codecs.h264.io.model.ScalingList[r1]
            r2.ScalingList4x4 = r3
            org.jcodec.codecs.h264.io.model.ScalingList[] r1 = new org.jcodec.codecs.h264.io.model.ScalingList[r1]
            r2.ScalingList8x8 = r1
            r2 = 6
            if (r0 >= r2) goto L2a
            r1 = 16
            org.jcodec.codecs.h264.io.model.ScalingList r1 = org.jcodec.codecs.h264.io.model.ScalingList.read(r4, r1)
            r3[r0] = r1
            goto L34
        L2a:
            int r2 = r0 + (-6)
            r3 = 64
            org.jcodec.codecs.h264.io.model.ScalingList r3 = org.jcodec.codecs.h264.io.model.ScalingList.read(r4, r3)
            r1[r2] = r3
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            return
    }

    private static org.jcodec.codecs.h264.io.model.VUIParameters readVUIParameters(org.jcodec.common.io.BitReader r4) {
            org.jcodec.codecs.h264.io.model.VUIParameters r0 = new org.jcodec.codecs.h264.io.model.VUIParameters
            r0.<init>()
            java.lang.String r1 = "VUI: aspect_ratio_info_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.aspect_ratio_info_present_flag = r1
            r2 = 8
            if (r1 == 0) goto L33
            java.lang.String r1 = "VUI: aspect_ratio"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r2, r1)
            org.jcodec.codecs.h264.io.model.AspectRatio r1 = org.jcodec.codecs.h264.io.model.AspectRatio.fromValue(r1)
            r0.aspect_ratio = r1
            org.jcodec.codecs.h264.io.model.AspectRatio r3 = org.jcodec.codecs.h264.io.model.AspectRatio.Extended_SAR
            if (r1 != r3) goto L33
            r1 = 16
            java.lang.String r3 = "VUI: sar_width"
            int r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r3)
            r0.sar_width = r3
            java.lang.String r3 = "VUI: sar_height"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r3)
            r0.sar_height = r1
        L33:
            java.lang.String r1 = "VUI: overscan_info_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.overscan_info_present_flag = r1
            if (r1 == 0) goto L45
            java.lang.String r1 = "VUI: overscan_appropriate_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.overscan_appropriate_flag = r1
        L45:
            java.lang.String r1 = "VUI: video_signal_type_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.video_signal_type_present_flag = r1
            if (r1 == 0) goto L82
            r1 = 3
            java.lang.String r3 = "VUI: video_format"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r3)
            r0.video_format = r1
            java.lang.String r1 = "VUI: video_full_range_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.video_full_range_flag = r1
            java.lang.String r1 = "VUI: colour_description_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.colour_description_present_flag = r1
            if (r1 == 0) goto L82
            java.lang.String r1 = "VUI: colour_primaries"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r2, r1)
            r0.colour_primaries = r1
            java.lang.String r1 = "VUI: transfer_characteristics"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r2, r1)
            r0.transfer_characteristics = r1
            java.lang.String r1 = "VUI: matrix_coefficients"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r2, r1)
            r0.matrix_coefficients = r1
        L82:
            java.lang.String r1 = "VUI: chroma_loc_info_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.chroma_loc_info_present_flag = r1
            if (r1 == 0) goto L9c
            java.lang.String r1 = "VUI chroma_sample_loc_type_top_field"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r1)
            r0.chroma_sample_loc_type_top_field = r1
            java.lang.String r1 = "VUI chroma_sample_loc_type_bottom_field"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r1)
            r0.chroma_sample_loc_type_bottom_field = r1
        L9c:
            java.lang.String r1 = "VUI: timing_info_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.timing_info_present_flag = r1
            if (r1 == 0) goto Lc0
            r1 = 32
            java.lang.String r2 = "VUI: num_units_in_tick"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.num_units_in_tick = r2
            java.lang.String r2 = "VUI: time_scale"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readNBit(r4, r1, r2)
            r0.time_scale = r1
            java.lang.String r1 = "VUI: fixed_frame_rate_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.fixed_frame_rate_flag = r1
        Lc0:
            java.lang.String r1 = "VUI: nal_hrd_parameters_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            if (r1 == 0) goto Lce
            org.jcodec.codecs.h264.io.model.HRDParameters r2 = readHRDParameters(r4)
            r0.nalHRDParams = r2
        Lce:
            java.lang.String r2 = "VUI: vcl_hrd_parameters_present_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r2)
            if (r2 == 0) goto Ldc
            org.jcodec.codecs.h264.io.model.HRDParameters r3 = readHRDParameters(r4)
            r0.vclHRDParams = r3
        Ldc:
            if (r1 != 0) goto Le0
            if (r2 == 0) goto Le8
        Le0:
            java.lang.String r1 = "VUI: low_delay_hrd_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.low_delay_hrd_flag = r1
        Le8:
            java.lang.String r1 = "VUI: pic_struct_present_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            r0.pic_struct_present_flag = r1
            java.lang.String r1 = "VUI: bitstream_restriction_flag"
            boolean r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r1)
            if (r1 == 0) goto L143
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r1 = new org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction
            r1.<init>()
            r0.bitstreamRestriction = r1
            java.lang.String r2 = "VUI: motion_vectors_over_pic_boundaries_flag"
            boolean r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r4, r2)
            r1.motion_vectors_over_pic_boundaries_flag = r2
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI max_bytes_per_pic_denom"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r2)
            r1.max_bytes_per_pic_denom = r2
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI max_bits_per_mb_denom"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r2)
            r1.max_bits_per_mb_denom = r2
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI log2_max_mv_length_horizontal"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r2)
            r1.log2_max_mv_length_horizontal = r2
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI log2_max_mv_length_vertical"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r2)
            r1.log2_max_mv_length_vertical = r2
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI num_reorder_frames"
            int r2 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r2)
            r1.num_reorder_frames = r2
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r1 = r0.bitstreamRestriction
            java.lang.String r2 = "VUI max_dec_frame_buffering"
            int r4 = org.jcodec.codecs.h264.decode.CAVLCReader.readUEtrace(r4, r2)
            r1.max_dec_frame_buffering = r4
        L143:
            return r0
    }

    private void writeHRDParameters(org.jcodec.codecs.h264.io.model.HRDParameters r5, org.jcodec.common.io.BitWriter r6) {
            r4 = this;
            int r0 = r5.cpb_cnt_minus1
            java.lang.String r1 = "HRD: cpb_cnt_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r6, r0, r1)
            int r0 = r5.bit_rate_scale
            long r0 = (long) r0
            r2 = 4
            java.lang.String r3 = "HRD: bit_rate_scale"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r6, r0, r2, r3)
            int r0 = r5.cpb_size_scale
            long r0 = (long) r0
            java.lang.String r3 = "HRD: cpb_size_scale"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r6, r0, r2, r3)
            r0 = 0
        L19:
            int r1 = r5.cpb_cnt_minus1
            if (r0 > r1) goto L37
            int[] r1 = r5.bit_rate_value_minus1
            r1 = r1[r0]
            java.lang.String r2 = "HRD: "
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r6, r1, r2)
            int[] r1 = r5.cpb_size_value_minus1
            r1 = r1[r0]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r6, r1, r2)
            boolean[] r1 = r5.cbr_flag
            boolean r1 = r1[r0]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r6, r1, r2)
            int r0 = r0 + 1
            goto L19
        L37:
            int r0 = r5.initial_cpb_removal_delay_length_minus1
            long r0 = (long) r0
            r2 = 5
            java.lang.String r3 = "HRD: initial_cpb_removal_delay_length_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r6, r0, r2, r3)
            int r0 = r5.cpb_removal_delay_length_minus1
            long r0 = (long) r0
            java.lang.String r3 = "HRD: cpb_removal_delay_length_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r6, r0, r2, r3)
            int r0 = r5.dpb_output_delay_length_minus1
            long r0 = (long) r0
            java.lang.String r3 = "HRD: dpb_output_delay_length_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r6, r0, r2, r3)
            int r5 = r5.time_offset_length
            long r0 = (long) r5
            java.lang.String r5 = "HRD: time_offset_length"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r6, r0, r2, r5)
            return
    }

    private void writeVUIParameters(org.jcodec.codecs.h264.io.model.VUIParameters r6, org.jcodec.common.io.BitWriter r7) {
            r5 = this;
            boolean r0 = r6.aspect_ratio_info_present_flag
            java.lang.String r1 = "VUI: aspect_ratio_info_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r1)
            boolean r0 = r6.aspect_ratio_info_present_flag
            r1 = 8
            if (r0 == 0) goto L31
            org.jcodec.codecs.h264.io.model.AspectRatio r0 = r6.aspect_ratio
            int r0 = r0.getValue()
            long r2 = (long) r0
            java.lang.String r0 = "VUI: aspect_ratio"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r2, r1, r0)
            org.jcodec.codecs.h264.io.model.AspectRatio r0 = r6.aspect_ratio
            org.jcodec.codecs.h264.io.model.AspectRatio r2 = org.jcodec.codecs.h264.io.model.AspectRatio.Extended_SAR
            if (r0 != r2) goto L31
            int r0 = r6.sar_width
            long r2 = (long) r0
            r0 = 16
            java.lang.String r4 = "VUI: sar_width"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r2, r0, r4)
            int r2 = r6.sar_height
            long r2 = (long) r2
            java.lang.String r4 = "VUI: sar_height"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r2, r0, r4)
        L31:
            boolean r0 = r6.overscan_info_present_flag
            java.lang.String r2 = "VUI: overscan_info_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r2)
            boolean r0 = r6.overscan_info_present_flag
            if (r0 == 0) goto L43
            boolean r0 = r6.overscan_appropriate_flag
            java.lang.String r2 = "VUI: overscan_appropriate_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r2)
        L43:
            boolean r0 = r6.video_signal_type_present_flag
            java.lang.String r2 = "VUI: video_signal_type_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r2)
            boolean r0 = r6.video_signal_type_present_flag
            if (r0 == 0) goto L81
            int r0 = r6.video_format
            long r2 = (long) r0
            r0 = 3
            java.lang.String r4 = "VUI: video_format"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r2, r0, r4)
            boolean r0 = r6.video_full_range_flag
            java.lang.String r2 = "VUI: video_full_range_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r2)
            boolean r0 = r6.colour_description_present_flag
            java.lang.String r2 = "VUI: colour_description_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r2)
            boolean r0 = r6.colour_description_present_flag
            if (r0 == 0) goto L81
            int r0 = r6.colour_primaries
            long r2 = (long) r0
            java.lang.String r0 = "VUI: colour_primaries"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r2, r1, r0)
            int r0 = r6.transfer_characteristics
            long r2 = (long) r0
            java.lang.String r0 = "VUI: transfer_characteristics"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r2, r1, r0)
            int r0 = r6.matrix_coefficients
            long r2 = (long) r0
            java.lang.String r0 = "VUI: matrix_coefficients"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r2, r1, r0)
        L81:
            boolean r0 = r6.chroma_loc_info_present_flag
            java.lang.String r1 = "VUI: chroma_loc_info_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r1)
            boolean r0 = r6.chroma_loc_info_present_flag
            if (r0 == 0) goto L9a
            int r0 = r6.chroma_sample_loc_type_top_field
            java.lang.String r1 = "VUI: chroma_sample_loc_type_top_field"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r0, r1)
            int r0 = r6.chroma_sample_loc_type_bottom_field
            java.lang.String r1 = "VUI: chroma_sample_loc_type_bottom_field"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r0, r1)
        L9a:
            boolean r0 = r6.timing_info_present_flag
            java.lang.String r1 = "VUI: timing_info_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r1)
            boolean r0 = r6.timing_info_present_flag
            if (r0 == 0) goto Lbe
            int r0 = r6.num_units_in_tick
            long r0 = (long) r0
            r2 = 32
            java.lang.String r3 = "VUI: num_units_in_tick"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r0, r2, r3)
            int r0 = r6.time_scale
            long r0 = (long) r0
            java.lang.String r3 = "VUI: time_scale"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r7, r0, r2, r3)
            boolean r0 = r6.fixed_frame_rate_flag
            java.lang.String r1 = "VUI: fixed_frame_rate_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r1)
        Lbe:
            org.jcodec.codecs.h264.io.model.HRDParameters r0 = r6.nalHRDParams
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc6
            r0 = 1
            goto Lc7
        Lc6:
            r0 = 0
        Lc7:
            java.lang.String r3 = "VUI: "
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r3)
            org.jcodec.codecs.h264.io.model.HRDParameters r0 = r6.nalHRDParams
            if (r0 == 0) goto Ld3
            r5.writeHRDParameters(r0, r7)
        Ld3:
            org.jcodec.codecs.h264.io.model.HRDParameters r0 = r6.vclHRDParams
            if (r0 == 0) goto Ld9
            r0 = 1
            goto Lda
        Ld9:
            r0 = 0
        Lda:
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r3)
            org.jcodec.codecs.h264.io.model.HRDParameters r0 = r6.vclHRDParams
            if (r0 == 0) goto Le4
            r5.writeHRDParameters(r0, r7)
        Le4:
            org.jcodec.codecs.h264.io.model.HRDParameters r0 = r6.nalHRDParams
            if (r0 != 0) goto Lec
            org.jcodec.codecs.h264.io.model.HRDParameters r0 = r6.vclHRDParams
            if (r0 == 0) goto Lf3
        Lec:
            boolean r0 = r6.low_delay_hrd_flag
            java.lang.String r4 = "VUI: low_delay_hrd_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r4)
        Lf3:
            boolean r0 = r6.pic_struct_present_flag
            java.lang.String r4 = "VUI: pic_struct_present_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r4)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            if (r0 == 0) goto Lff
            goto L100
        Lff:
            r1 = 0
        L100:
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r1, r3)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            if (r0 == 0) goto L144
            boolean r0 = r0.motion_vectors_over_pic_boundaries_flag
            java.lang.String r1 = "VUI: motion_vectors_over_pic_boundaries_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r7, r0, r1)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.max_bytes_per_pic_denom
            java.lang.String r1 = "VUI: max_bytes_per_pic_denom"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r0, r1)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.max_bits_per_mb_denom
            java.lang.String r1 = "VUI: max_bits_per_mb_denom"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r0, r1)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.log2_max_mv_length_horizontal
            java.lang.String r1 = "VUI: log2_max_mv_length_horizontal"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r0, r1)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.log2_max_mv_length_vertical
            java.lang.String r1 = "VUI: log2_max_mv_length_vertical"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r0, r1)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r0 = r6.bitstreamRestriction
            int r0 = r0.num_reorder_frames
            java.lang.String r1 = "VUI: num_reorder_frames"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r0, r1)
            org.jcodec.codecs.h264.io.model.VUIParameters$BitstreamRestriction r6 = r6.bitstreamRestriction
            int r6 = r6.max_dec_frame_buffering
            java.lang.String r0 = "VUI: max_dec_frame_buffering"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r7, r6, r0)
        L144:
            return
    }

    public void write(java.nio.ByteBuffer r9) {
            r8 = this;
            org.jcodec.common.io.BitWriter r0 = new org.jcodec.common.io.BitWriter
            r0.<init>(r9)
            int r9 = r8.profile_idc
            long r1 = (long) r9
            r9 = 8
            java.lang.String r3 = "SPS: profile_idc"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r0, r1, r9, r3)
            boolean r1 = r8.constraint_set_0_flag
            java.lang.String r2 = "SPS: constraint_set_0_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r2)
            boolean r1 = r8.constraint_set_1_flag
            java.lang.String r2 = "SPS: constraint_set_1_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r2)
            boolean r1 = r8.constraint_set_2_flag
            java.lang.String r2 = "SPS: constraint_set_2_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r2)
            boolean r1 = r8.constraint_set_3_flag
            java.lang.String r2 = "SPS: constraint_set_3_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r2)
            boolean r1 = r8.constraint_set_4_flag
            java.lang.String r2 = "SPS: constraint_set_4_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r2)
            boolean r1 = r8.constraint_set_5_flag
            java.lang.String r2 = "SPS: constraint_set_5_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r2)
            r1 = 0
            r3 = 2
            java.lang.String r4 = "SPS: reserved"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r0, r1, r3, r4)
            int r1 = r8.level_idc
            long r1 = (long) r1
            java.lang.String r3 = "SPS: level_idc"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeNBit(r0, r1, r9, r3)
            int r1 = r8.seq_parameter_set_id
            java.lang.String r2 = "SPS: seq_parameter_set_id"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r1, r2)
            int r1 = r8.profile_idc
            r2 = 0
            r3 = 1
            java.lang.String r4 = "SPS: "
            r5 = 100
            if (r1 == r5) goto L66
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L66
            r5 = 122(0x7a, float:1.71E-43)
            if (r1 == r5) goto L66
            r5 = 144(0x90, float:2.02E-43)
            if (r1 != r5) goto Ldf
        L66:
            org.jcodec.common.model.ColorSpace r1 = r8.chroma_format_idc
            int r1 = fromColor(r1)
            java.lang.String r5 = "SPS: chroma_format_idc"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r1, r5)
            org.jcodec.common.model.ColorSpace r1 = r8.chroma_format_idc
            org.jcodec.common.model.ColorSpace r5 = org.jcodec.common.model.ColorSpace.YUV444
            if (r1 != r5) goto L7e
            boolean r1 = r8.residual_color_transform_flag
            java.lang.String r5 = "SPS: residual_color_transform_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r5)
        L7e:
            int r1 = r8.bit_depth_luma_minus8
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r1, r4)
            int r1 = r8.bit_depth_chroma_minus8
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r1, r4)
            boolean r1 = r8.qpprime_y_zero_transform_bypass_flag
            java.lang.String r5 = "SPS: qpprime_y_zero_transform_bypass_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r5)
            org.jcodec.codecs.h264.io.model.ScalingMatrix r1 = r8.scalingMatrix
            if (r1 == 0) goto L95
            r1 = 1
            goto L96
        L95:
            r1 = 0
        L96:
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r1, r4)
            org.jcodec.codecs.h264.io.model.ScalingMatrix r1 = r8.scalingMatrix
            if (r1 == 0) goto Ldf
            r1 = 0
        L9e:
            if (r1 >= r9) goto Ldf
            r5 = 6
            if (r1 >= r5) goto Lbf
            org.jcodec.codecs.h264.io.model.ScalingMatrix r5 = r8.scalingMatrix
            org.jcodec.codecs.h264.io.model.ScalingList[] r5 = r5.ScalingList4x4
            r5 = r5[r1]
            if (r5 == 0) goto Lad
            r5 = 1
            goto Lae
        Lad:
            r5 = 0
        Lae:
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r5, r4)
            org.jcodec.codecs.h264.io.model.ScalingMatrix r5 = r8.scalingMatrix
            org.jcodec.codecs.h264.io.model.ScalingList[] r5 = r5.ScalingList4x4
            r6 = r5[r1]
            if (r6 == 0) goto Ldc
            r5 = r5[r1]
            r5.write(r0)
            goto Ldc
        Lbf:
            org.jcodec.codecs.h264.io.model.ScalingMatrix r5 = r8.scalingMatrix
            org.jcodec.codecs.h264.io.model.ScalingList[] r5 = r5.ScalingList8x8
            int r6 = r1 + (-6)
            r5 = r5[r6]
            if (r5 == 0) goto Lcb
            r5 = 1
            goto Lcc
        Lcb:
            r5 = 0
        Lcc:
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r5, r4)
            org.jcodec.codecs.h264.io.model.ScalingMatrix r5 = r8.scalingMatrix
            org.jcodec.codecs.h264.io.model.ScalingList[] r5 = r5.ScalingList8x8
            r7 = r5[r6]
            if (r7 == 0) goto Ldc
            r5 = r5[r6]
            r5.write(r0)
        Ldc:
            int r1 = r1 + 1
            goto L9e
        Ldf:
            int r9 = r8.log2_max_frame_num_minus4
            java.lang.String r1 = "SPS: log2_max_frame_num_minus4"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.pic_order_cnt_type
            java.lang.String r1 = "SPS: pic_order_cnt_type"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.pic_order_cnt_type
            if (r9 != 0) goto Lf9
            int r9 = r8.log2_max_pic_order_cnt_lsb_minus4
            java.lang.String r1 = "SPS: log2_max_pic_order_cnt_lsb_minus4"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            goto L124
        Lf9:
            if (r9 != r3) goto L124
            boolean r9 = r8.delta_pic_order_always_zero_flag
            java.lang.String r1 = "SPS: delta_pic_order_always_zero_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            int r9 = r8.offset_for_non_ref_pic
            java.lang.String r1 = "SPS: offset_for_non_ref_pic"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r0, r9, r1)
            int r9 = r8.offset_for_top_to_bottom_field
            java.lang.String r1 = "SPS: offset_for_top_to_bottom_field"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r0, r9, r1)
            int[] r9 = r8.offsetForRefFrame
            int r9 = r9.length
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r4)
            r9 = 0
        L117:
            int[] r1 = r8.offsetForRefFrame
            int r5 = r1.length
            if (r9 >= r5) goto L124
            r1 = r1[r9]
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeSEtrace(r0, r1, r4)
            int r9 = r9 + 1
            goto L117
        L124:
            int r9 = r8.num_ref_frames
            java.lang.String r1 = "SPS: num_ref_frames"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            boolean r9 = r8.gaps_in_frame_num_value_allowed_flag
            java.lang.String r1 = "SPS: gaps_in_frame_num_value_allowed_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            int r9 = r8.pic_width_in_mbs_minus1
            java.lang.String r1 = "SPS: pic_width_in_mbs_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.pic_height_in_map_units_minus1
            java.lang.String r1 = "SPS: pic_height_in_map_units_minus1"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            boolean r9 = r8.frame_mbs_only_flag
            java.lang.String r1 = "SPS: frame_mbs_only_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            boolean r9 = r8.frame_mbs_only_flag
            if (r9 != 0) goto L152
            boolean r9 = r8.mb_adaptive_frame_field_flag
            java.lang.String r1 = "SPS: mb_adaptive_frame_field_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
        L152:
            boolean r9 = r8.direct_8x8_inference_flag
            java.lang.String r1 = "SPS: direct_8x8_inference_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            boolean r9 = r8.frame_cropping_flag
            java.lang.String r1 = "SPS: frame_cropping_flag"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r9, r1)
            boolean r9 = r8.frame_cropping_flag
            if (r9 == 0) goto L180
            int r9 = r8.frame_crop_left_offset
            java.lang.String r1 = "SPS: frame_crop_left_offset"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.frame_crop_right_offset
            java.lang.String r1 = "SPS: frame_crop_right_offset"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.frame_crop_top_offset
            java.lang.String r1 = "SPS: frame_crop_top_offset"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
            int r9 = r8.frame_crop_bottom_offset
            java.lang.String r1 = "SPS: frame_crop_bottom_offset"
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeUEtrace(r0, r9, r1)
        L180:
            org.jcodec.codecs.h264.io.model.VUIParameters r9 = r8.vuiParams
            if (r9 == 0) goto L185
            r2 = 1
        L185:
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeBool(r0, r2, r4)
            org.jcodec.codecs.h264.io.model.VUIParameters r9 = r8.vuiParams
            if (r9 == 0) goto L18f
            r8.writeVUIParameters(r9, r0)
        L18f:
            org.jcodec.codecs.h264.io.write.CAVLCWriter.writeTrailingBits(r0)
            return
    }
}
