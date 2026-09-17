package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbk implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbk> CREATOR = null;
    public final long zza;
    private final com.google.android.gms.internal.ads.zzbj[] zzb;

    static {
            com.google.android.gms.internal.ads.zzbi r0 = new com.google.android.gms.internal.ads.zzbi
            r0.<init>()
            com.google.android.gms.internal.ads.zzbk.CREATOR = r0
            return
    }

    public zzbk(long r1, com.google.android.gms.internal.ads.zzbj... r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    zzbk(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            com.google.android.gms.internal.ads.zzbj[] r0 = new com.google.android.gms.internal.ads.zzbj[r0]
            r3.zzb = r0
            r0 = 0
        Lc:
            com.google.android.gms.internal.ads.zzbj[] r1 = r3.zzb
            int r2 = r1.length
            if (r0 >= r2) goto L22
            java.lang.Class<com.google.android.gms.internal.ads.zzbj> r2 = com.google.android.gms.internal.ads.zzbj.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r4.readParcelable(r2)
            com.google.android.gms.internal.ads.zzbj r2 = (com.google.android.gms.internal.ads.zzbj) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lc
        L22:
            long r0 = r4.readLong()
            r3.zza = r0
            return
    }

    public zzbk(java.util.List r3) {
            r2 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzbj[] r0 = new com.google.android.gms.internal.ads.zzbj[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            com.google.android.gms.internal.ads.zzbj[] r3 = (com.google.android.gms.internal.ads.zzbj[]) r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.<init>(r0, r3)
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L25
            java.lang.Class<com.google.android.gms.internal.ads.zzbk> r2 = com.google.android.gms.internal.ads.zzbk.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.gms.internal.ads.zzbk r7 = (com.google.android.gms.internal.ads.zzbk) r7
            com.google.android.gms.internal.ads.zzbj[] r2 = r6.zzb
            com.google.android.gms.internal.ads.zzbj[] r3 = r7.zzb
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L25
            long r2 = r6.zza
            long r4 = r7.zza
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L25
            return r0
        L25:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbj[] r0 = r5.zzb
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r5.zza
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.zza
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            com.google.android.gms.internal.ads.zzbj[] r2 = r5.zzb
            java.lang.String r2 = java.util.Arrays.toString(r2)
            if (r4 != 0) goto L14
            java.lang.String r0 = ""
            goto L25
        L14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ", presentationTimeUs="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "entries="
            r1.append(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbj[] r6 = r4.zzb
            int r6 = r6.length
            r5.writeInt(r6)
            com.google.android.gms.internal.ads.zzbj[] r6 = r4.zzb
            int r0 = r6.length
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto Lb
        L15:
            long r0 = r4.zza
            r5.writeLong(r0)
            return
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbj[] r0 = r1.zzb
            int r0 = r0.length
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbj zzb(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbj[] r0 = r1.zzb
            r2 = r0[r2]
            return r2
    }

    public final com.google.android.gms.internal.ads.zzbk zzc(com.google.android.gms.internal.ads.zzbj... r9) {
            r8 = this;
            int r0 = r9.length
            if (r0 != 0) goto L4
            return r8
        L4:
            long r1 = r8.zza
            com.google.android.gms.internal.ads.zzbj[] r3 = r8.zzb
            com.google.android.gms.internal.ads.zzbk r4 = new com.google.android.gms.internal.ads.zzbk
            int r5 = com.google.android.gms.internal.ads.zzeu.zza
            int r5 = r3.length
            r6 = 0
            int r7 = r5 + r0
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r7)
            java.lang.System.arraycopy(r9, r6, r3, r5, r0)
            com.google.android.gms.internal.ads.zzbj[] r3 = (com.google.android.gms.internal.ads.zzbj[]) r3
            r4.<init>(r1, r3)
            return r4
    }

    public final com.google.android.gms.internal.ads.zzbk zzd(com.google.android.gms.internal.ads.zzbk r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return r0
        L3:
            com.google.android.gms.internal.ads.zzbj[] r1 = r1.zzb
            com.google.android.gms.internal.ads.zzbk r1 = r0.zzc(r1)
            return r1
    }
}
