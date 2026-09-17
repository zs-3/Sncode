package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SafeBrowsingConfigParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbyh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbyh> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final java.util.List zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final boolean zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public final java.util.List zzh;

    static {
            com.google.android.gms.internal.ads.zzbyi r0 = new com.google.android.gms.internal.ads.zzbyi
            r0.<init>()
            com.google.android.gms.internal.ads.zzbyh.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbyh(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.util.List r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.util.List r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            if (r8 != 0) goto L18
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L18:
            r0.zzh = r8
            return
    }

    public static com.google.android.gms.internal.ads.zzbyh zza(org.json.JSONObject r11) throws org.json.JSONException {
            java.lang.String r0 = "click_string"
            java.lang.String r1 = ""
            java.lang.String r3 = r11.optString(r0, r1)
            java.lang.String r0 = "report_url"
            java.lang.String r4 = r11.optString(r0, r1)
            java.lang.String r0 = "rendered_ad_enabled"
            r1 = 0
            boolean r5 = r11.optBoolean(r0, r1)
            java.lang.String r0 = "non_malicious_reporting_enabled"
            boolean r6 = r11.optBoolean(r0, r1)
            java.lang.String r0 = "allowed_headers"
            org.json.JSONArray r0 = r11.optJSONArray(r0)
            r2 = 0
            java.util.List r7 = com.google.android.gms.ads.internal.util.zzbs.zzc(r0, r2)
            java.lang.String r0 = "webview_permissions"
            org.json.JSONArray r0 = r11.optJSONArray(r0)
            java.util.List r10 = com.google.android.gms.ads.internal.util.zzbs.zzc(r0, r2)
            java.lang.String r0 = "protection_enabled"
            boolean r8 = r11.optBoolean(r0, r1)
            java.lang.String r0 = "malicious_reporting_enabled"
            boolean r9 = r11.optBoolean(r0, r1)
            com.google.android.gms.internal.ads.zzbyh r11 = new com.google.android.gms.internal.ads.zzbyh
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            java.lang.String r5 = r3.zzb
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            boolean r5 = r3.zzc
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            boolean r5 = r3.zzd
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            java.util.List r5 = r3.zze
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r5, r2)
            boolean r5 = r3.zzf
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            boolean r5 = r3.zzg
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            java.util.List r5 = r3.zzh
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
