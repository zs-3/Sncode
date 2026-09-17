package com.google.firebase.components;

/* loaded from: classes2.dex */
final class RestrictedComponentContainer implements com.google.firebase.components.ComponentContainer {
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedDeferredInterfaces;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedDirectInterfaces;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedProviderInterfaces;
    private final java.util.Set<java.lang.Class<?>> allowedPublishedEvents;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedSetDirectInterfaces;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedSetProviderInterfaces;
    private final com.google.firebase.components.ComponentContainer delegateContainer;

    private static class RestrictedPublisher implements com.google.firebase.events.Publisher {
        private final java.util.Set<java.lang.Class<?>> allowedPublishedEvents;
        private final com.google.firebase.events.Publisher delegate;

        public RestrictedPublisher(java.util.Set<java.lang.Class<?>> r1, com.google.firebase.events.Publisher r2) {
                r0 = this;
                r0.<init>()
                r0.allowedPublishedEvents = r1
                r0.delegate = r2
                return
        }
    }

    RestrictedComponentContainer(com.google.firebase.components.Component<?> r9, com.google.firebase.components.ComponentContainer r10) {
            r8 = this;
            r8.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set r5 = r9.getDependencies()
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r5.next()
            com.google.firebase.components.Dependency r6 = (com.google.firebase.components.Dependency) r6
            boolean r7 = r6.isDirectInjection()
            if (r7 == 0) goto L4c
            boolean r7 = r6.isSet()
            if (r7 == 0) goto L44
            com.google.firebase.components.Qualified r6 = r6.getInterface()
            r3.add(r6)
            goto L24
        L44:
            com.google.firebase.components.Qualified r6 = r6.getInterface()
            r0.add(r6)
            goto L24
        L4c:
            boolean r7 = r6.isDeferred()
            if (r7 == 0) goto L5a
            com.google.firebase.components.Qualified r6 = r6.getInterface()
            r2.add(r6)
            goto L24
        L5a:
            boolean r7 = r6.isSet()
            if (r7 == 0) goto L68
            com.google.firebase.components.Qualified r6 = r6.getInterface()
            r4.add(r6)
            goto L24
        L68:
            com.google.firebase.components.Qualified r6 = r6.getInterface()
            r1.add(r6)
            goto L24
        L70:
            java.util.Set r5 = r9.getPublishedEvents()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L83
            java.lang.Class<com.google.firebase.events.Publisher> r5 = com.google.firebase.events.Publisher.class
            com.google.firebase.components.Qualified r5 = com.google.firebase.components.Qualified.unqualified(r5)
            r0.add(r5)
        L83:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r8.allowedDirectInterfaces = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
            r8.allowedProviderInterfaces = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)
            r8.allowedDeferredInterfaces = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r3)
            r8.allowedSetDirectInterfaces = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r4)
            r8.allowedSetProviderInterfaces = r0
            java.util.Set r9 = r9.getPublishedEvents()
            r8.allowedPublishedEvents = r9
            r8.delegateContainer = r10
            return
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(com.google.firebase.components.Qualified<T> r4) {
            r3 = this;
            java.util.Set<com.google.firebase.components.Qualified<?>> r0 = r3.allowedDirectInterfaces
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            com.google.firebase.components.ComponentContainer r0 = r3.delegateContainer
            java.lang.Object r4 = r0.get(r4)
            return r4
        Lf:
            com.google.firebase.components.DependencyException r0 = new com.google.firebase.components.DependencyException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency %s."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(java.lang.Class<T> r4) {
            r3 = this;
            java.util.Set<com.google.firebase.components.Qualified<?>> r0 = r3.allowedDirectInterfaces
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L25
            com.google.firebase.components.ComponentContainer r0 = r3.delegateContainer
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class<com.google.firebase.events.Publisher> r1 = com.google.firebase.events.Publisher.class
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            return r0
        L1b:
            com.google.firebase.components.RestrictedComponentContainer$RestrictedPublisher r4 = new com.google.firebase.components.RestrictedComponentContainer$RestrictedPublisher
            java.util.Set<java.lang.Class<?>> r1 = r3.allowedPublishedEvents
            com.google.firebase.events.Publisher r0 = (com.google.firebase.events.Publisher) r0
            r4.<init>(r1, r0)
            return r4
        L25:
            com.google.firebase.components.DependencyException r0 = new com.google.firebase.components.DependencyException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency %s."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Deferred<T> getDeferred(com.google.firebase.components.Qualified<T> r4) {
            r3 = this;
            java.util.Set<com.google.firebase.components.Qualified<?>> r0 = r3.allowedDeferredInterfaces
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            com.google.firebase.components.ComponentContainer r0 = r3.delegateContainer
            com.google.firebase.inject.Deferred r4 = r0.getDeferred(r4)
            return r4
        Lf:
            com.google.firebase.components.DependencyException r0 = new com.google.firebase.components.DependencyException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Deferred<%s>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Deferred<T> getDeferred(java.lang.Class<T> r1) {
            r0 = this;
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
            com.google.firebase.inject.Deferred r1 = r0.getDeferred(r1)
            return r1
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<T> getProvider(com.google.firebase.components.Qualified<T> r4) {
            r3 = this;
            java.util.Set<com.google.firebase.components.Qualified<?>> r0 = r3.allowedProviderInterfaces
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            com.google.firebase.components.ComponentContainer r0 = r3.delegateContainer
            com.google.firebase.inject.Provider r4 = r0.getProvider(r4)
            return r4
        Lf:
            com.google.firebase.components.DependencyException r0 = new com.google.firebase.components.DependencyException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Provider<%s>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> r1) {
            r0 = this;
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
            com.google.firebase.inject.Provider r1 = r0.getProvider(r1)
            return r1
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> java.util.Set<T> setOf(com.google.firebase.components.Qualified<T> r4) {
            r3 = this;
            java.util.Set<com.google.firebase.components.Qualified<?>> r0 = r3.allowedSetDirectInterfaces
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            com.google.firebase.components.ComponentContainer r0 = r3.delegateContainer
            java.util.Set r4 = r0.setOf(r4)
            return r4
        Lf:
            com.google.firebase.components.DependencyException r0 = new com.google.firebase.components.DependencyException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Set<%s>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ java.util.Set setOf(java.lang.Class r1) {
            r0 = this;
            java.util.Set r1 = com.google.firebase.components.ComponentContainer.CC.$default$setOf(r0, r1)
            return r1
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(com.google.firebase.components.Qualified<T> r4) {
            r3 = this;
            java.util.Set<com.google.firebase.components.Qualified<?>> r0 = r3.allowedSetProviderInterfaces
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            com.google.firebase.components.ComponentContainer r0 = r3.delegateContainer
            com.google.firebase.inject.Provider r4 = r0.setOfProvider(r4)
            return r4
        Lf:
            com.google.firebase.components.DependencyException r0 = new com.google.firebase.components.DependencyException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Provider<Set<%s>>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }
}
