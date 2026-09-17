package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzo {
    private static final android.net.Uri zza = null;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final android.content.ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    static {
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzo.zza = r0
            return
    }

    public zzo(android.content.ComponentName r1, int r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.zzb = r2
            r0.zzc = r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzd = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zze = r1
            r1 = 0
            r0.zzf = r1
            return
    }

    public zzo(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r3 = "com.google.android.gms"
            r4 = 4225(0x1081, float:5.92E-42)
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public zzo(java.lang.String r1, java.lang.String r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zzb = r1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzc = r2
            r1 = 0
            r0.zzd = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zze = r1
            r0.zzf = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.internal.zzo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.internal.zzo r5 = (com.google.android.gms.common.internal.zzo) r5
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            android.content.ComponentName r1 = r4.zzd
            android.content.ComponentName r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            boolean r1 = r4.zzf
            boolean r5 = r5.zzf
            if (r1 != r5) goto L31
            return r0
        L31:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zzb
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zzc
            r2 = 1
            r1[r2] = r0
            android.content.ComponentName r0 = r3.zzd
            r2 = 2
            r1[r2] = r0
            r0 = 4225(0x1081, float:5.92E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r1[r2] = r0
            boolean r0 = r3.zzf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 4
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            if (r0 != 0) goto Lf
            android.content.ComponentName r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.ComponentName r0 = r1.zzd
            java.lang.String r0 = r0.flattenToString()
        Lf:
            return r0
    }

    public final android.content.ComponentName zza() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzd
            return r0
    }

    public final android.content.Intent zzb(android.content.Context r6) throws com.google.android.gms.common.internal.zzaj {
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.zzb
            if (r1 == 0) goto Lb0
            boolean r1 = r5.zzf
            r2 = 0
            if (r1 == 0) goto La0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.zzb
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            android.net.Uri r3 = com.google.android.gms.common.internal.zzo.zza     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r3)     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            if (r6 == 0) goto L36
            java.lang.String r3 = "serviceIntentCall"
            android.os.Bundle r1 = r6.call(r3, r2, r1)     // Catch: java.lang.Throwable -> L31
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            goto L4f
        L2d:
            r6 = move-exception
            goto L42
        L2f:
            r6 = move-exception
            goto L42
        L31:
            r1 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            throw r1     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
        L36:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            java.lang.String r1 = "Failed to acquire ContentProviderClient"
            r6.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
            throw r6     // Catch: java.lang.IllegalArgumentException -> L3e android.os.RemoteException -> L40
        L3e:
            r6 = move-exception
            goto L41
        L40:
            r6 = move-exception
        L41:
            r1 = r2
        L42:
            java.lang.String r6 = r6.toString()
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r3.concat(r6)
            android.util.Log.w(r0, r6)
        L4f:
            if (r1 == 0) goto L8f
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 != 0) goto L8e
            java.lang.String r2 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            if (r1 != 0) goto L66
            goto L8e
        L66:
            java.lang.String r6 = r5.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " but has possible resolution"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r0, r6)
            com.google.android.gms.common.internal.zzaj r6 = new com.google.android.gms.common.internal.zzaj
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r2 = 25
            r0.<init>(r2, r1)
            r6.<init>(r0)
            throw r6
        L8e:
            r2 = r6
        L8f:
            if (r2 != 0) goto La0
            java.lang.String r6 = r5.zzb
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        La0:
            if (r2 != 0) goto Lbb
            java.lang.String r6 = r5.zzb
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r5.zzc
            android.content.Intent r6 = r0.setPackage(r6)
            return r6
        Lb0:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.zzd
            android.content.Intent r2 = r6.setComponent(r0)
        Lbb:
            return r2
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
