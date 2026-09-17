package com.google.android.gms.games.event;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "EventEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class EventEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.event.Event {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.event.EventEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEventId", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getName", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDescription", id = 3)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUri", id = 4)
    private final android.net.Uri zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIconImageUrl", id = 5)
    private final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPlayer", id = 6)
    private final com.google.android.gms.games.PlayerEntity zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getValue", id = 7)
    private final long zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFormattedValue", id = 8)
    private final java.lang.String zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isVisible", id = 9)
    private final boolean zzi;

    static {
            com.google.android.gms.games.event.zza r0 = new com.google.android.gms.games.event.zza
            r0.<init>()
            com.google.android.gms.games.event.EventEntity.CREATOR = r0
            return
    }

    public EventEntity(com.google.android.gms.games.event.Event r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.getEventId()
            r2.zza = r0
            java.lang.String r0 = r3.getName()
            r2.zzb = r0
            java.lang.String r0 = r3.getDescription()
            r2.zzc = r0
            android.net.Uri r0 = r3.getIconImageUri()
            r2.zzd = r0
            java.lang.String r0 = r3.getIconImageUrl()
            r2.zze = r0
            com.google.android.gms.games.Player r0 = r3.getPlayer()
            java.lang.Object r0 = r0.freeze()
            com.google.android.gms.games.PlayerEntity r0 = (com.google.android.gms.games.PlayerEntity) r0
            r2.zzf = r0
            long r0 = r3.getValue()
            r2.zzg = r0
            java.lang.String r0 = r3.getFormattedValue()
            r2.zzh = r0
            boolean r3 = r3.isVisible()
            r2.zzi = r3
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    EventEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.net.Uri r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.games.Player r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) long r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) boolean r10) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            com.google.android.gms.games.PlayerEntity r1 = new com.google.android.gms.games.PlayerEntity
            r1.<init>(r6)
            r0.zzf = r1
            r0.zzg = r7
            r0.zzh = r9
            r0.zzi = r10
            return
    }

    static int zza(com.google.android.gms.games.event.Event r3) {
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.getEventId()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.getName()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.getDescription()
            r2 = 2
            r0[r2] = r1
            android.net.Uri r1 = r3.getIconImageUri()
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.getIconImageUrl()
            r2 = 4
            r0[r2] = r1
            com.google.android.gms.games.Player r1 = r3.getPlayer()
            r2 = 5
            r0[r2] = r1
            long r1 = r3.getValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            java.lang.String r1 = r3.getFormattedValue()
            r2 = 7
            r0[r2] = r1
            boolean r3 = r3.isVisible()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1 = 8
            r0[r1] = r3
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r3
    }

    static java.lang.String zzb(com.google.android.gms.games.event.Event r3) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.getEventId()
            java.lang.String r2 = "Id"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = "Name"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getDescription()
            java.lang.String r2 = "Description"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            android.net.Uri r1 = r3.getIconImageUri()
            java.lang.String r2 = "IconImageUri"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getIconImageUrl()
            java.lang.String r2 = "IconImageUrl"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.android.gms.games.Player r1 = r3.getPlayer()
            java.lang.String r2 = "Player"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            long r1 = r3.getValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Value"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r1 = r3.getFormattedValue()
            java.lang.String r2 = "FormattedValue"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            boolean r3 = r3.isVisible()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "isVisible"
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static boolean zzc(com.google.android.gms.games.event.Event r5, java.lang.Object r6) {
            boolean r0 = r6 instanceof com.google.android.gms.games.event.Event
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r6) goto La
            return r0
        La:
            com.google.android.gms.games.event.Event r6 = (com.google.android.gms.games.event.Event) r6
            java.lang.String r2 = r6.getEventId()
            java.lang.String r3 = r5.getEventId()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            java.lang.String r2 = r6.getName()
            java.lang.String r3 = r5.getName()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            java.lang.String r2 = r6.getDescription()
            java.lang.String r3 = r5.getDescription()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            android.net.Uri r2 = r6.getIconImageUri()
            android.net.Uri r3 = r5.getIconImageUri()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            java.lang.String r2 = r6.getIconImageUrl()
            java.lang.String r3 = r5.getIconImageUrl()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            com.google.android.gms.games.Player r2 = r6.getPlayer()
            com.google.android.gms.games.Player r3 = r5.getPlayer()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            long r2 = r6.getValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r5.getValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            java.lang.String r2 = r6.getFormattedValue()
            java.lang.String r3 = r5.getFormattedValue()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L9b
            boolean r6 = r6.isVisible()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r5 = r5.isVisible()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r6, r5)
            if (r5 == 0) goto L9b
            return r0
        L9b:
            return r1
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = zzc(r0, r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.event.Event freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.event.Event freeze() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzc
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getEventId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getFormattedValue() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public void getFormattedValue(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzh
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.event.Event
    public android.net.Uri getIconImageUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public void getName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.event.Event
    public com.google.android.gms.games.Player getPlayer() {
            r1 = this;
            com.google.android.gms.games.PlayerEntity r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public long getValue() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = zza(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.zzi
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = zzb(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.getEventId()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getName()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getDescription()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.getIconImageUri()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.getIconImageUrl()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            com.google.android.gms.games.Player r1 = r4.getPlayer()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            long r1 = r4.getValue()
            r6 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            java.lang.String r6 = r4.getFormattedValue()
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            boolean r6 = r4.isVisible()
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
