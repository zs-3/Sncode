package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public class SliceHeader {
    public boolean bottom_field_flag;
    public int cabac_init_idc;
    public int[] delta_pic_order_cnt;
    public int delta_pic_order_cnt_bottom;
    public boolean direct_spatial_mv_pred_flag;
    public int disable_deblocking_filter_idc;
    public boolean field_pic_flag;
    public int first_mb_in_slice;
    public int frame_num;
    public int idr_pic_id;
    public int[] num_ref_idx_active_minus1;
    public boolean num_ref_idx_active_override_flag;
    public int pic_order_cnt_lsb;
    public int pic_parameter_set_id;
    public org.jcodec.codecs.h264.io.model.PictureParameterSet pps;
    public int redundant_pic_cnt;
    public org.jcodec.codecs.h264.io.model.RefPicMarkingIDR refPicMarkingIDR;
    public int[][][] refPicReordering;
    public int slice_alpha_c0_offset_div2;
    public int slice_beta_offset_div2;
    public int slice_group_change_cycle;
    public int slice_qp_delta;
    public int slice_qs_delta;
    public org.jcodec.codecs.h264.io.model.SliceType slice_type;
    public boolean slice_type_restr;
    public boolean sp_for_switch_flag;
    public org.jcodec.codecs.h264.io.model.SeqParameterSet sps;

    public SliceHeader() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.num_ref_idx_active_minus1 = r0
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = org.jcodec.common.tools.ToJSON.toJSON(r1)
            return r0
    }
}
