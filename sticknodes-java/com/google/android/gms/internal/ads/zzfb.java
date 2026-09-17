package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfb implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfb> CREATOR = null;
    public final float zza;
    public final float zzb;

    static {
            com.google.android.gms.internal.ads.zzez r0 = new com.google.android.gms.internal.ads.zzez
            r0.<init>()
            com.google.android.gms.internal.ads.zzfb.CREATOR = r0
            return
    }

    public zzfb(float r3, float r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L1d
            r1 = 1119092736(0x42b40000, float:90.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L1d
            r1 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L1d
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 > 0) goto L1d
            r0 = 1
        L1d:
            java.lang.String r1 = "Invalid latitude or longitude"
            com.google.android.gms.internal.ads.zzdi.zze(r0, r1)
            r2.zza = r3
            r2.zzb = r4
            return
    }

    /* synthetic */ zzfb(android.os.Parcel r1, com.google.android.gms.internal.ads.zzfa r2) {
            r0 = this;
            r0.<init>()
            float r2 = r1.readFloat()
            r0.zza = r2
            float r1 = r1.readFloat()
            r0.zzb = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class<com.google.android.gms.internal.ads.zzfb> r2 = com.google.android.gms.internal.ads.zzfb.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L23
        L10:
            com.google.android.gms.internal.ads.zzfb r5 = (com.google.android.gms.internal.ads.zzfb) r5
            float r2 = r4.zza
            float r3 = r5.zza
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L23
            float r2 = r4.zzb
            float r5 = r5.zzb
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L23
            return r0
        L23:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.zza
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            float r1 = r2.zzb
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "xyz: latitude="
            r0.append(r1)
            float r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", longitude="
            r0.append(r1)
            float r1 = r2.zzb
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.zza
            r1.writeFloat(r2)
            float r2 = r0.zzb
            r1.writeFloat(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbf r1) {
            r0 = this;
            return
    }
}
