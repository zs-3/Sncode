package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbbd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbbd> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getContentFileDescriptor", id = 2)
    private android.os.ParcelFileDescriptor zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", id = 3)
    private final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isDownloaded", id = 4)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCachedBytes", id = 5)
    private final long zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isGcacheHit", id = 6)
    private final boolean zze;

    static {
            com.google.android.gms.internal.ads.zzbbe r0 = new com.google.android.gms.internal.ads.zzbbe
            r0.<init>()
            com.google.android.gms.internal.ads.zzbbd.CREATOR = r0
            return
    }

    public zzbbd() {
            r7 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbbd(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.ParcelFileDescriptor r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) long r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) boolean r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r6
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.os.ParcelFileDescriptor r1 = r4.zzb()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzd()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.zzf()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            long r1 = r4.zza()
            r6 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            boolean r6 = r4.zzg()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final synchronized long zza() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.zzd     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    final synchronized android.os.ParcelFileDescriptor zzb() {
            r1 = this;
            monitor-enter(r1)
            android.os.ParcelFileDescriptor r0 = r1.zza     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.io.InputStream zzc() {
            r3 = this;
            monitor-enter(r3)
            android.os.ParcelFileDescriptor r0 = r3.zza     // Catch: java.lang.Throwable -> L13
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r3)
            return r1
        L8:
            android.os.ParcelFileDescriptor$AutoCloseInputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch: java.lang.Throwable -> L13
            android.os.ParcelFileDescriptor r2 = r3.zza     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r3.zza = r1     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized boolean zzd() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zze() {
            r1 = this;
            monitor-enter(r1)
            android.os.ParcelFileDescriptor r0 = r1.zza     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8
            r0 = 1
        L6:
            monitor-exit(r1)
            return r0
        L8:
            r0 = 0
            goto L6
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zzf() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zzg() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zze     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
