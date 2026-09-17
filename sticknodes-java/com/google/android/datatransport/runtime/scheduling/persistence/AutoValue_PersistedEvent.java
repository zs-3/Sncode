package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
final class AutoValue_PersistedEvent extends com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent {
    private final com.google.android.datatransport.runtime.EventInternal event;
    private final long id;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;

    AutoValue_PersistedEvent(long r1, com.google.android.datatransport.runtime.TransportContext r3, com.google.android.datatransport.runtime.EventInternal r4) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            java.lang.String r1 = "Null transportContext"
            java.util.Objects.requireNonNull(r3, r1)
            r0.transportContext = r3
            java.lang.String r1 = "Null event"
            java.util.Objects.requireNonNull(r4, r1)
            r0.event = r4
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
            r2 = 0
            if (r1 == 0) goto L30
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r8 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r8
            long r3 = r7.id
            long r5 = r8.getId()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2e
            com.google.android.datatransport.runtime.TransportContext r1 = r7.transportContext
            com.google.android.datatransport.runtime.TransportContext r3 = r8.getTransportContext()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            com.google.android.datatransport.runtime.EventInternal r1 = r7.event
            com.google.android.datatransport.runtime.EventInternal r8 = r8.getEvent()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
        L30:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public com.google.android.datatransport.runtime.EventInternal getEvent() {
            r1 = this;
            com.google.android.datatransport.runtime.EventInternal r0 = r1.event
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public com.google.android.datatransport.runtime.TransportContext getTransportContext() {
            r1 = this;
            com.google.android.datatransport.runtime.TransportContext r0 = r1.transportContext
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.id
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            com.google.android.datatransport.runtime.TransportContext r2 = r4.transportContext
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            com.google.android.datatransport.runtime.EventInternal r0 = r4.event
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PersistedEvent{id="
            r0.append(r1)
            long r1 = r3.id
            r0.append(r1)
            java.lang.String r1 = ", transportContext="
            r0.append(r1)
            com.google.android.datatransport.runtime.TransportContext r1 = r3.transportContext
            r0.append(r1)
            java.lang.String r1 = ", event="
            r0.append(r1)
            com.google.android.datatransport.runtime.EventInternal r1 = r3.event
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
