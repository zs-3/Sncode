package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahg extends com.google.android.gms.internal.ads.zzagv {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahg> CREATOR = null;
    public final java.lang.String zza;
    public final java.lang.String zzb;

    static {
            com.google.android.gms.internal.ads.zzahf r0 = new com.google.android.gms.internal.ads.zzahf
            r0.<init>()
            com.google.android.gms.internal.ads.zzahg.CREATOR = r0
            return
    }

    zzahg(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
    }

    public zzahg(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            r0.zzb = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<com.google.android.gms.internal.ads.zzahg> r2 = com.google.android.gms.internal.ads.zzahg.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            com.google.android.gms.internal.ads.zzahg r5 = (com.google.android.gms.internal.ads.zzahg) r5
            java.lang.String r2 = r4.zzf
            java.lang.String r3 = r5.zzf
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.zzb
            java.lang.String r5 = r5.zzb
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zzf
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            java.lang.String r1 = r4.zza
            r2 = 0
            if (r1 == 0) goto L12
            int r1 = r1.hashCode()
            goto L13
        L12:
            r1 = 0
        L13:
            int r0 = r0 * 31
            java.lang.String r3 = r4.zzb
            if (r3 == 0) goto L1d
            int r2 = r3.hashCode()
        L1d:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.zzf
            r0.append(r1)
            java.lang.String r1 = ": url="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zzf
            r1.writeString(r2)
            java.lang.String r2 = r0.zza
            r1.writeString(r2)
            java.lang.String r2 = r0.zzb
            r1.writeString(r2)
            return
    }
}
