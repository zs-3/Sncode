package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahq implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahq> CREATOR = null;
    public final float zza;
    public final int zzb;

    static {
            com.google.android.gms.internal.ads.zzaho r0 = new com.google.android.gms.internal.ads.zzaho
            r0.<init>()
            com.google.android.gms.internal.ads.zzahq.CREATOR = r0
            return
    }

    public zzahq(float r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    /* synthetic */ zzahq(android.os.Parcel r1, com.google.android.gms.internal.ads.zzahp r2) {
            r0 = this;
            r0.<init>()
            float r2 = r1.readFloat()
            r0.zza = r2
            int r1 = r1.readInt()
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
            if (r5 == 0) goto L21
            java.lang.Class<com.google.android.gms.internal.ads.zzahq> r2 = com.google.android.gms.internal.ads.zzahq.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L21
        L10:
            com.google.android.gms.internal.ads.zzahq r5 = (com.google.android.gms.internal.ads.zzahq) r5
            float r2 = r4.zza
            float r3 = r5.zza
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L21
            int r2 = r4.zzb
            int r5 = r5.zzb
            if (r2 != r5) goto L21
            return r0
        L21:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.zza
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = r2.zzb
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "smta: captureFrameRate="
            r0.append(r1)
            float r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", svcTemporalLayerCount="
            r0.append(r1)
            int r1 = r2.zzb
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.zza
            r1.writeFloat(r2)
            int r2 = r0.zzb
            r1.writeInt(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbf r1) {
            r0 = this;
            return
    }
}
