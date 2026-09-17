package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RewardItemParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbwy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbwy> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zzb;

    static {
            com.google.android.gms.internal.ads.zzbwz r0 = new com.google.android.gms.internal.ads.zzbwz
            r0.<init>()
            com.google.android.gms.internal.ads.zzbwy.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbwy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzbwy zza(org.json.JSONArray r4) throws org.json.JSONException {
            if (r4 == 0) goto L24
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L24
        L9:
            com.google.android.gms.internal.ads.zzbwy r0 = new com.google.android.gms.internal.ads.zzbwy
            r1 = 0
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r3 = "rb_type"
            java.lang.String r2 = r2.optString(r3)
            org.json.JSONObject r4 = r4.getJSONObject(r1)
            java.lang.String r1 = "rb_amount"
            int r4 = r4.optInt(r1)
            r0.<init>(r2, r4)
            return r0
        L24:
            r4 = 0
            return r4
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L28
            boolean r1 = r4 instanceof com.google.android.gms.internal.ads.zzbwy
            if (r1 != 0) goto L8
            goto L28
        L8:
            com.google.android.gms.internal.ads.zzbwy r4 = (com.google.android.gms.internal.ads.zzbwy) r4
            java.lang.String r1 = r3.zza
            java.lang.String r2 = r4.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            if (r1 == 0) goto L28
            int r1 = r3.zzb
            int r4 = r4.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r1, r4)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            int r5 = r3.zzb
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
