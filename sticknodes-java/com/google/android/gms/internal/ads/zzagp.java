package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzagp extends com.google.android.gms.internal.ads.zzagv {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagp> CREATOR = null;
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    static {
            com.google.android.gms.internal.ads.zzago r0 = new com.google.android.gms.internal.ads.zzago
            r0.<init>()
            com.google.android.gms.internal.ads.zzagp.CREATOR = r0
            return
    }

    zzagp(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "COMM"
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zza = r0
            java.lang.String r0 = r3.readString()
            r2.zzb = r0
            java.lang.String r3 = r3.readString()
            r2.zzc = r3
            return
    }

    public zzagp(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "COMM"
            r1.<init>(r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
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
            java.lang.Class<com.google.android.gms.internal.ads.zzagp> r2 = com.google.android.gms.internal.ads.zzagp.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            com.google.android.gms.internal.ads.zzagp r5 = (com.google.android.gms.internal.ads.zzagp) r5
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.zzc
            java.lang.String r5 = r5.zzc
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zza
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r2 = r4.zzb
            if (r2 == 0) goto L14
            int r2 = r2.hashCode()
            goto L15
        L14:
            r2 = 0
        L15:
            int r0 = r0 + 527
            java.lang.String r3 = r4.zzc
            if (r3 == 0) goto L1f
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 * 31
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.zzf
            r0.append(r1)
            java.lang.String r1 = ": language="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r2.zzc
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
            java.lang.String r2 = r0.zzc
            r1.writeString(r2)
            return
    }
}
