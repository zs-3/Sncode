package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class HRDParameters {
    public int bit_rate_scale;
    public int[] bit_rate_value_minus1;
    public boolean[] cbr_flag;
    public int cpb_cnt_minus1;
    public int cpb_removal_delay_length_minus1;
    public int cpb_size_scale;
    public int[] cpb_size_value_minus1;
    public int dpb_output_delay_length_minus1;
    public int initial_cpb_removal_delay_length_minus1;
    public int time_offset_length;

    public HRDParameters() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HRDParameters{cpb_cnt_minus1="
            r0.<init>(r1)
            int r1 = r2.cpb_cnt_minus1
            r0.append(r1)
            java.lang.String r1 = ", bit_rate_scale="
            r0.append(r1)
            int r1 = r2.bit_rate_scale
            r0.append(r1)
            java.lang.String r1 = ", cpb_size_scale="
            r0.append(r1)
            int r1 = r2.cpb_size_scale
            r0.append(r1)
            java.lang.String r1 = ", bit_rate_value_minus1="
            r0.append(r1)
            int[] r1 = r2.bit_rate_value_minus1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", cpb_size_value_minus1="
            r0.append(r1)
            int[] r1 = r2.cpb_size_value_minus1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", cbr_flag="
            r0.append(r1)
            boolean[] r1 = r2.cbr_flag
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", initial_cpb_removal_delay_length_minus1="
            r0.append(r1)
            int r1 = r2.initial_cpb_removal_delay_length_minus1
            r0.append(r1)
            java.lang.String r1 = ", cpb_removal_delay_length_minus1="
            r0.append(r1)
            int r1 = r2.cpb_removal_delay_length_minus1
            r0.append(r1)
            java.lang.String r1 = ", dpb_output_delay_length_minus1="
            r0.append(r1)
            int r1 = r2.dpb_output_delay_length_minus1
            r0.append(r1)
            java.lang.String r1 = ", time_offset_length="
            r0.append(r1)
            int r1 = r2.time_offset_length
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
