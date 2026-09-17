package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdValueParcelCreator")
/* loaded from: classes.dex */
public final class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzu> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final long zzd;

    static {
            com.google.android.gms.ads.internal.client.zzv r0 = new com.google.android.gms.ads.internal.client.zzv
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzu.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzu(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public static com.google.android.gms.ads.internal.client.zzu zza(org.json.JSONObject r7) throws org.json.JSONException {
            java.lang.String r0 = "type_num"
            int r2 = r7.getInt(r0)
            java.lang.String r0 = "precision_num"
            int r3 = r7.getInt(r0)
            java.lang.String r0 = "currency"
            java.lang.String r4 = r7.getString(r0)
            java.lang.String r0 = "value"
            long r5 = r7.getLong(r0)
            com.google.android.gms.ads.internal.client.zzu r7 = new com.google.android.gms.ads.internal.client.zzu
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            return r7
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            int r5 = r3.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            java.lang.String r5 = r3.zzc
            r1 = 3
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            long r1 = r3.zzd
            r5 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
