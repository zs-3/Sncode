package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class VUIParameters {
    public com.googlecode.mp4parser.h264.model.AspectRatio aspect_ratio;
    public boolean aspect_ratio_info_present_flag;
    public com.googlecode.mp4parser.h264.model.VUIParameters.BitstreamRestriction bitstreamRestriction;
    public boolean chroma_loc_info_present_flag;
    public int chroma_sample_loc_type_bottom_field;
    public int chroma_sample_loc_type_top_field;
    public boolean colour_description_present_flag;
    public int colour_primaries;
    public boolean fixed_frame_rate_flag;
    public boolean low_delay_hrd_flag;
    public int matrix_coefficients;
    public com.googlecode.mp4parser.h264.model.HRDParameters nalHRDParams;
    public int num_units_in_tick;
    public boolean overscan_appropriate_flag;
    public boolean overscan_info_present_flag;
    public boolean pic_struct_present_flag;
    public int sar_height;
    public int sar_width;
    public int time_scale;
    public boolean timing_info_present_flag;
    public int transfer_characteristics;
    public com.googlecode.mp4parser.h264.model.HRDParameters vclHRDParams;
    public int video_format;
    public boolean video_full_range_flag;
    public boolean video_signal_type_present_flag;

    public static class BitstreamRestriction {
        public int log2_max_mv_length_horizontal;
        public int log2_max_mv_length_vertical;
        public int max_bits_per_mb_denom;
        public int max_bytes_per_pic_denom;
        public int max_dec_frame_buffering;
        public boolean motion_vectors_over_pic_boundaries_flag;
        public int num_reorder_frames;

        public BitstreamRestriction() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "BitstreamRestriction{"
                r0.<init>(r1)
                java.lang.String r1 = "motion_vectors_over_pic_boundaries_flag="
                r0.append(r1)
                boolean r1 = r2.motion_vectors_over_pic_boundaries_flag
                r0.append(r1)
                java.lang.String r1 = ", max_bytes_per_pic_denom="
                r0.append(r1)
                int r1 = r2.max_bytes_per_pic_denom
                r0.append(r1)
                java.lang.String r1 = ", max_bits_per_mb_denom="
                r0.append(r1)
                int r1 = r2.max_bits_per_mb_denom
                r0.append(r1)
                java.lang.String r1 = ", log2_max_mv_length_horizontal="
                r0.append(r1)
                int r1 = r2.log2_max_mv_length_horizontal
                r0.append(r1)
                java.lang.String r1 = ", log2_max_mv_length_vertical="
                r0.append(r1)
                int r1 = r2.log2_max_mv_length_vertical
                r0.append(r1)
                java.lang.String r1 = ", num_reorder_frames="
                r0.append(r1)
                int r1 = r2.num_reorder_frames
                r0.append(r1)
                java.lang.String r1 = ", max_dec_frame_buffering="
                r0.append(r1)
                int r1 = r2.max_dec_frame_buffering
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public VUIParameters() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VUIParameters{\naspect_ratio_info_present_flag="
            r0.<init>(r1)
            boolean r1 = r3.aspect_ratio_info_present_flag
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r2 = ", sar_width="
            r0.append(r2)
            int r2 = r3.sar_width
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", sar_height="
            r0.append(r2)
            int r2 = r3.sar_height
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", overscan_info_present_flag="
            r0.append(r2)
            boolean r2 = r3.overscan_info_present_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", overscan_appropriate_flag="
            r0.append(r2)
            boolean r2 = r3.overscan_appropriate_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", video_signal_type_present_flag="
            r0.append(r2)
            boolean r2 = r3.video_signal_type_present_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", video_format="
            r0.append(r2)
            int r2 = r3.video_format
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", video_full_range_flag="
            r0.append(r2)
            boolean r2 = r3.video_full_range_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", colour_description_present_flag="
            r0.append(r2)
            boolean r2 = r3.colour_description_present_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", colour_primaries="
            r0.append(r2)
            int r2 = r3.colour_primaries
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", transfer_characteristics="
            r0.append(r2)
            int r2 = r3.transfer_characteristics
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", matrix_coefficients="
            r0.append(r2)
            int r2 = r3.matrix_coefficients
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", chroma_loc_info_present_flag="
            r0.append(r2)
            boolean r2 = r3.chroma_loc_info_present_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", chroma_sample_loc_type_top_field="
            r0.append(r2)
            int r2 = r3.chroma_sample_loc_type_top_field
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", chroma_sample_loc_type_bottom_field="
            r0.append(r2)
            int r2 = r3.chroma_sample_loc_type_bottom_field
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", timing_info_present_flag="
            r0.append(r2)
            boolean r2 = r3.timing_info_present_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", num_units_in_tick="
            r0.append(r2)
            int r2 = r3.num_units_in_tick
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", time_scale="
            r0.append(r2)
            int r2 = r3.time_scale
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", fixed_frame_rate_flag="
            r0.append(r2)
            boolean r2 = r3.fixed_frame_rate_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", low_delay_hrd_flag="
            r0.append(r2)
            boolean r2 = r3.low_delay_hrd_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", pic_struct_present_flag="
            r0.append(r2)
            boolean r2 = r3.pic_struct_present_flag
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", nalHRDParams="
            r0.append(r2)
            com.googlecode.mp4parser.h264.model.HRDParameters r2 = r3.nalHRDParams
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", vclHRDParams="
            r0.append(r2)
            com.googlecode.mp4parser.h264.model.HRDParameters r2 = r3.vclHRDParams
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", bitstreamRestriction="
            r0.append(r2)
            com.googlecode.mp4parser.h264.model.VUIParameters$BitstreamRestriction r2 = r3.bitstreamRestriction
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", aspect_ratio="
            r0.append(r2)
            com.googlecode.mp4parser.h264.model.AspectRatio r2 = r3.aspect_ratio
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
