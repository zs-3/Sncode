package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GetServiceRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({9})
/* loaded from: classes.dex */
public class GetServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.GetServiceRequest> CREATOR = null;
    static final com.google.android.gms.common.api.Scope[] zza = null;
    static final com.google.android.gms.common.Feature[] zzb = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final int zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    android.os.IBinder zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    com.google.android.gms.common.api.Scope[] zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    android.os.Bundle zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    android.accounts.Account zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    com.google.android.gms.common.Feature[] zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    com.google.android.gms.common.Feature[] zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 12)
    final boolean zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "0", id = 13)
    final int zzn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean zzo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    private final java.lang.String zzp;

    static {
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            r0.<init>()
            com.google.android.gms.common.internal.GetServiceRequest.CREATOR = r0
            r0 = 0
            com.google.android.gms.common.api.Scope[] r1 = new com.google.android.gms.common.api.Scope[r0]
            com.google.android.gms.common.internal.GetServiceRequest.zza = r1
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.internal.GetServiceRequest.zzb = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    GetServiceRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.common.api.Scope[] r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) android.os.Bundle r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) android.accounts.Account r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) com.google.android.gms.common.Feature[] r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) com.google.android.gms.common.Feature[] r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) boolean r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) int r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) boolean r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) java.lang.String r14) {
            r0 = this;
            r0.<init>()
            if (r6 != 0) goto L7
            com.google.android.gms.common.api.Scope[] r6 = com.google.android.gms.common.internal.GetServiceRequest.zza
        L7:
            if (r7 != 0) goto Le
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        Le:
            if (r9 != 0) goto L12
            com.google.android.gms.common.Feature[] r9 = com.google.android.gms.common.internal.GetServiceRequest.zzb
        L12:
            if (r10 != 0) goto L16
            com.google.android.gms.common.Feature[] r10 = com.google.android.gms.common.internal.GetServiceRequest.zzb
        L16:
            r0.zzc = r1
            r0.zzd = r2
            r0.zze = r3
            java.lang.String r2 = "com.google.android.gms"
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L27
            r0.zzf = r2
            goto L29
        L27:
            r0.zzf = r4
        L29:
            r2 = 2
            if (r1 >= r2) goto L3b
            if (r5 == 0) goto L37
            com.google.android.gms.common.internal.IAccountAccessor r1 = com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(r5)
            android.accounts.Account r1 = com.google.android.gms.common.internal.AccountAccessor.getAccountBinderSafe(r1)
            goto L38
        L37:
            r1 = 0
        L38:
            r0.zzj = r1
            goto L3f
        L3b:
            r0.zzg = r5
            r0.zzj = r8
        L3f:
            r0.zzh = r6
            r0.zzi = r7
            r0.zzk = r9
            r0.zzl = r10
            r0.zzm = r11
            r0.zzn = r12
            r0.zzo = r13
            r0.zzp = r14
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getAttributionTag() {
            r1 = this;
            java.lang.String r0 = r1.zzp
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getCallingPackage() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getClientApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = r1.zzl
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getClientLibraryVersion() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getExtraArgs() {
            r1 = this;
            android.os.Bundle r0 = r1.zzi
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.common.internal.zzn.zza(r0, r1, r2)
            return
    }
}
