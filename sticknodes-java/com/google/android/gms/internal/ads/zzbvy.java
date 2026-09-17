package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "LargeParcelTeleporterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbvy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbvy> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    android.os.ParcelFileDescriptor zza;
    private android.os.Parcelable zzb;
    private boolean zzc;

    static {
            com.google.android.gms.internal.ads.zzbvz r0 = new com.google.android.gms.internal.ads.zzbvz
            r0.<init>()
            com.google.android.gms.internal.ads.zzbvy.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbvy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.ParcelFileDescriptor r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            r1 = 1
            r0.zzc = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r8, int r9) {
            r7 = this;
            android.os.ParcelFileDescriptor r0 = r7.zza
            r1 = 0
            if (r0 != 0) goto L4c
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcelable r2 = r7.zzb     // Catch: java.lang.Throwable -> L47
            r2.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L47
            byte[] r2 = r0.marshall()     // Catch: java.lang.Throwable -> L47
            r0.recycle()
            r0 = 0
            android.os.ParcelFileDescriptor[] r3 = android.os.ParcelFileDescriptor.createPipe()     // Catch: java.io.IOException -> L31
            r4 = 1
            r4 = r3[r4]     // Catch: java.io.IOException -> L31
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r5 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch: java.io.IOException -> L31
            r5.<init>(r4)     // Catch: java.io.IOException -> L31
            com.google.android.gms.internal.ads.zzgfz r4 = com.google.android.gms.internal.ads.zzcan.zza     // Catch: java.io.IOException -> L2f
            com.google.android.gms.internal.ads.zzbvx r6 = new com.google.android.gms.internal.ads.zzbvx     // Catch: java.io.IOException -> L2f
            r6.<init>(r5, r2)     // Catch: java.io.IOException -> L2f
            r4.execute(r6)     // Catch: java.io.IOException -> L2f
            r0 = r3[r1]     // Catch: java.io.IOException -> L2f
            goto L44
        L2f:
            r2 = move-exception
            goto L33
        L31:
            r2 = move-exception
            r5 = r0
        L33:
            java.lang.String r3 = "Error transporting the ad response"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r2)
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r4 = "LargeParcelTeleporter.pipeData.2"
            r3.zzw(r2, r4)
            com.google.android.gms.common.util.IOUtils.closeQuietly(r5)
        L44:
            r7.zza = r0
            goto L4c
        L47:
            r8 = move-exception
            r0.recycle()
            throw r8
        L4c:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r8)
            r2 = 2
            android.os.ParcelFileDescriptor r3 = r7.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r8, r2, r3, r9, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r8, r0)
            return
    }

    public final com.google.android.gms.common.internal.safeparcel.SafeParcelable zza(android.os.Parcelable.Creator r6) {
            r5 = this;
            boolean r0 = r5.zzc
            if (r0 == 0) goto L55
            android.os.ParcelFileDescriptor r0 = r5.zza
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.String r6 = "File descriptor is empty, returning null."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r6)
            return r1
        Lf:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            android.os.ParcelFileDescriptor$AutoCloseInputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            android.os.ParcelFileDescriptor r3 = r5.zza
            r2.<init>(r3)
            r0.<init>(r2)
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            r4 = 0
            r0.readFully(r3, r4, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.unmarshall(r3, r4, r2)     // Catch: java.lang.Throwable -> L40
            r0.setDataPosition(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r6.createFromParcel(r0)     // Catch: java.lang.Throwable -> L40
            android.os.Parcelable r6 = (android.os.Parcelable) r6     // Catch: java.lang.Throwable -> L40
            r5.zzb = r6     // Catch: java.lang.Throwable -> L40
            r0.recycle()
            r5.zzc = r4
            goto L55
        L40:
            r6 = move-exception
            r0.recycle()
            throw r6
        L45:
            r6 = move-exception
            goto L51
        L47:
            r6 = move-exception
            java.lang.String r2 = "Could not read from parcel file descriptor"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r6)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
            return r1
        L51:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
            throw r6
        L55:
            android.os.Parcelable r6 = r5.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r6 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r6
            return r6
    }
}
