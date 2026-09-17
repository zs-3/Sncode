package com.google.android.gms.drive;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ChangeSequenceNumberCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class zza extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.zza> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final long zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final long zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final long zzg;
    private volatile java.lang.String zzh;

    static {
            com.google.android.gms.drive.zzb r0 = new com.google.android.gms.drive.zzb
            r0.<init>()
            com.google.android.gms.drive.zza.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zza(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) long r10) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.zzh = r0
            r0 = 1
            r1 = 0
            r2 = -1
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            r4 = 1
            goto L11
        L10:
            r4 = 0
        L11:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L1a
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r5.zze = r6
            r5.zzf = r8
            r5.zzg = r10
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L28
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<com.google.android.gms.drive.zza> r2 = com.google.android.gms.drive.zza.class
            if (r1 == r2) goto Lc
            goto L28
        Lc:
            com.google.android.gms.drive.zza r7 = (com.google.android.gms.drive.zza) r7
            long r1 = r7.zzf
            long r3 = r6.zzf
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L28
            long r1 = r7.zzg
            long r3 = r6.zzg
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L28
            long r1 = r7.zze
            long r3 = r6.zze
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L28
            r7 = 1
            return r7
        L28:
            return r0
    }

    public int hashCode() {
            r5 = this;
            long r0 = r5.zze
            java.lang.String r0 = java.lang.String.valueOf(r0)
            long r1 = r5.zzf
            java.lang.String r1 = java.lang.String.valueOf(r1)
            long r2 = r5.zzg
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r0)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.zzh
            if (r0 != 0) goto L49
            com.google.android.gms.internal.drive.zzez$zza r0 = com.google.android.gms.internal.drive.zzez.zzaj()
            r1 = 1
            com.google.android.gms.internal.drive.zzez$zza r0 = r0.zzk(r1)
            long r1 = r3.zze
            com.google.android.gms.internal.drive.zzez$zza r0 = r0.zzc(r1)
            long r1 = r3.zzf
            com.google.android.gms.internal.drive.zzez$zza r0 = r0.zzd(r1)
            long r1 = r3.zzg
            com.google.android.gms.internal.drive.zzez$zza r0 = r0.zze(r1)
            com.google.android.gms.internal.drive.zzlq r0 = r0.zzdf()
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            com.google.android.gms.internal.drive.zzez r0 = (com.google.android.gms.internal.drive.zzez) r0
            byte[] r0 = r0.toByteArray()
            r1 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "ChangeSequenceNumber:"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L42
            java.lang.String r0 = r1.concat(r0)
            goto L47
        L42:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L47:
            r3.zzh = r0
        L49:
            java.lang.String r0 = r3.zzh
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            long r0 = r3.zze
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            long r0 = r3.zzf
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            long r0 = r3.zzg
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
