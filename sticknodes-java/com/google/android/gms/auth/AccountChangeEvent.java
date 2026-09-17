package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AccountChangeEventCreator")
/* loaded from: classes.dex */
public class AccountChangeEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEvent> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final long zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    final int zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    final java.lang.String zzf;

    static {
            com.google.android.gms.auth.zza r0 = new com.google.android.gms.auth.zza
            r0.<init>()
            com.google.android.gms.auth.AccountChangeEvent.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AccountChangeEvent(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzc = r1
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            return
    }

    public AccountChangeEvent(long r2, java.lang.String r4, int r5, int r6, java.lang.String r7) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zza = r0
            r1.zzb = r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r2 = (java.lang.String) r2
            r1.zzc = r2
            r1.zzd = r5
            r1.zze = r6
            r1.zzf = r7
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.auth.AccountChangeEvent
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r8 != r7) goto La
            return r0
        La:
            com.google.android.gms.auth.AccountChangeEvent r8 = (com.google.android.gms.auth.AccountChangeEvent) r8
            int r2 = r7.zza
            int r3 = r8.zza
            if (r2 != r3) goto L3b
            long r2 = r7.zzb
            long r4 = r8.zzb
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            java.lang.String r2 = r7.zzc
            java.lang.String r3 = r8.zzc
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L3b
            int r2 = r7.zzd
            int r3 = r8.zzd
            if (r2 != r3) goto L3b
            int r2 = r7.zze
            int r3 = r8.zze
            if (r2 != r3) goto L3b
            java.lang.String r2 = r7.zzf
            java.lang.String r8 = r8.zzf
            boolean r8 = com.google.android.gms.common.internal.Objects.equal(r2, r8)
            if (r8 == 0) goto L3b
            return r0
        L3b:
            return r1
    }

    public java.lang.String getAccountName() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public java.lang.String getChangeData() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public int getChangeType() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public int getEventIndex() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.zzb
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            int r1 = r3.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r1 = r3.zze
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.zzd
            r1 = 1
            if (r0 == r1) goto L1a
            r1 = 2
            if (r0 == r1) goto L17
            r1 = 3
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L11
            java.lang.String r0 = "UNKNOWN"
            goto L1c
        L11:
            java.lang.String r0 = "RENAMED_TO"
            goto L1c
        L14:
            java.lang.String r0 = "RENAMED_FROM"
            goto L1c
        L17:
            java.lang.String r0 = "REMOVED"
            goto L1c
        L1a:
            java.lang.String r0 = "ADDED"
        L1c:
            java.lang.String r1 = r6.zzc
            java.lang.String r2 = r6.zzf
            int r3 = r6.zze
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "AccountChangeEvent {accountName = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ", changeType = "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ", changeData = "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", eventIndex = "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            long r0 = r3.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            java.lang.String r0 = r3.zzc
            r1 = 3
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            int r0 = r3.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.zze
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.String r0 = r3.zzf
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
