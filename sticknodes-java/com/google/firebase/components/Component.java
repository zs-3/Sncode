package com.google.firebase.components;

/* loaded from: classes2.dex */
public final class Component<T> {
    private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
    private final com.google.firebase.components.ComponentFactory<T> factory;
    private final int instantiation;
    private final java.lang.String name;
    private final java.util.Set<com.google.firebase.components.Qualified<? super T>> providedInterfaces;
    private final java.util.Set<java.lang.Class<?>> publishedEvents;
    private final int type;

    /* renamed from: com.google.firebase.components.Component$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder<T> {
        private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
        private com.google.firebase.components.ComponentFactory<T> factory;
        private int instantiation;
        private java.lang.String name;
        private final java.util.Set<com.google.firebase.components.Qualified<? super T>> providedInterfaces;
        private final java.util.Set<java.lang.Class<?>> publishedEvents;
        private int type;

        @java.lang.SafeVarargs
        private Builder(com.google.firebase.components.Qualified<T> r4, com.google.firebase.components.Qualified<? super T>... r5) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.name = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r3.providedInterfaces = r0
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r3.dependencies = r1
                r1 = 0
                r3.instantiation = r1
                r3.type = r1
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                r3.publishedEvents = r2
                java.lang.String r2 = "Null interface"
                com.google.firebase.components.Preconditions.checkNotNull(r4, r2)
                r0.add(r4)
                int r4 = r5.length
            L29:
                if (r1 >= r4) goto L33
                r0 = r5[r1]
                com.google.firebase.components.Preconditions.checkNotNull(r0, r2)
                int r1 = r1 + 1
                goto L29
            L33:
                java.util.Set<com.google.firebase.components.Qualified<? super T>> r4 = r3.providedInterfaces
                java.util.Collections.addAll(r4, r5)
                return
        }

        /* synthetic */ Builder(com.google.firebase.components.Qualified r1, com.google.firebase.components.Qualified[] r2, com.google.firebase.components.Component.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @java.lang.SafeVarargs
        private Builder(java.lang.Class<T> r5, java.lang.Class<? super T>... r6) {
                r4 = this;
                r4.<init>()
                r0 = 0
                r4.name = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r4.providedInterfaces = r0
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r4.dependencies = r1
                r1 = 0
                r4.instantiation = r1
                r4.type = r1
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                r4.publishedEvents = r2
                java.lang.String r2 = "Null interface"
                com.google.firebase.components.Preconditions.checkNotNull(r5, r2)
                com.google.firebase.components.Qualified r5 = com.google.firebase.components.Qualified.unqualified(r5)
                r0.add(r5)
                int r5 = r6.length
            L2d:
                if (r1 >= r5) goto L40
                r0 = r6[r1]
                com.google.firebase.components.Preconditions.checkNotNull(r0, r2)
                java.util.Set<com.google.firebase.components.Qualified<? super T>> r3 = r4.providedInterfaces
                com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.unqualified(r0)
                r3.add(r0)
                int r1 = r1 + 1
                goto L2d
            L40:
                return
        }

        /* synthetic */ Builder(java.lang.Class r1, java.lang.Class[] r2, com.google.firebase.components.Component.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ com.google.firebase.components.Component.Builder access$200(com.google.firebase.components.Component.Builder r0) {
                com.google.firebase.components.Component$Builder r0 = r0.intoSet()
                return r0
        }

        private com.google.firebase.components.Component.Builder<T> intoSet() {
                r1 = this;
                r0 = 1
                r1.type = r0
                return r1
        }

        private com.google.firebase.components.Component.Builder<T> setInstantiation(int r3) {
                r2 = this;
                int r0 = r2.instantiation
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "Instantiation type has already been set."
                com.google.firebase.components.Preconditions.checkState(r0, r1)
                r2.instantiation = r3
                return r2
        }

        private void validateInterface(com.google.firebase.components.Qualified<?> r2) {
                r1 = this;
                java.util.Set<com.google.firebase.components.Qualified<? super T>> r0 = r1.providedInterfaces
                boolean r2 = r0.contains(r2)
                r2 = r2 ^ 1
                java.lang.String r0 = "Components are not allowed to depend on interfaces they themselves provide."
                com.google.firebase.components.Preconditions.checkArgument(r2, r0)
                return
        }

        public com.google.firebase.components.Component.Builder<T> add(com.google.firebase.components.Dependency r2) {
                r1 = this;
                java.lang.String r0 = "Null dependency"
                com.google.firebase.components.Preconditions.checkNotNull(r2, r0)
                com.google.firebase.components.Qualified r0 = r2.getInterface()
                r1.validateInterface(r0)
                java.util.Set<com.google.firebase.components.Dependency> r0 = r1.dependencies
                r0.add(r2)
                return r1
        }

        public com.google.firebase.components.Component<T> build() {
                r11 = this;
                com.google.firebase.components.ComponentFactory<T> r0 = r11.factory
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "Missing required property: factory."
                com.google.firebase.components.Preconditions.checkState(r0, r1)
                com.google.firebase.components.Component r0 = new com.google.firebase.components.Component
                java.lang.String r3 = r11.name
                java.util.HashSet r4 = new java.util.HashSet
                java.util.Set<com.google.firebase.components.Qualified<? super T>> r1 = r11.providedInterfaces
                r4.<init>(r1)
                java.util.HashSet r5 = new java.util.HashSet
                java.util.Set<com.google.firebase.components.Dependency> r1 = r11.dependencies
                r5.<init>(r1)
                int r6 = r11.instantiation
                int r7 = r11.type
                com.google.firebase.components.ComponentFactory<T> r8 = r11.factory
                java.util.Set<java.lang.Class<?>> r9 = r11.publishedEvents
                r10 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }

        public com.google.firebase.components.Component.Builder<T> eagerInDefaultApp() {
                r1 = this;
                r0 = 2
                com.google.firebase.components.Component$Builder r0 = r1.setInstantiation(r0)
                return r0
        }

        public com.google.firebase.components.Component.Builder<T> factory(com.google.firebase.components.ComponentFactory<T> r2) {
                r1 = this;
                java.lang.String r0 = "Null factory"
                java.lang.Object r2 = com.google.firebase.components.Preconditions.checkNotNull(r2, r0)
                com.google.firebase.components.ComponentFactory r2 = (com.google.firebase.components.ComponentFactory) r2
                r1.factory = r2
                return r1
        }

        public com.google.firebase.components.Component.Builder<T> name(java.lang.String r1) {
                r0 = this;
                r0.name = r1
                return r0
        }
    }

    /* renamed from: $r8$lambda$Ffrth-d9Peo_i_HGmbM5iJb0gQQ, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m38$r8$lambda$Ffrthd9Peo_i_HGmbM5iJb0gQQ(java.lang.Object r0, com.google.firebase.components.ComponentContainer r1) {
            java.lang.Object r0 = lambda$intoSet$3(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$KryL7UebsJ6sFV-CDK2Yw3_BWQc, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m39$r8$lambda$KryL7UebsJ6sFVCDK2Yw3_BWQc(java.lang.Object r0, com.google.firebase.components.ComponentContainer r1) {
            java.lang.Object r0 = lambda$of$1(r0, r1)
            return r0
    }

    private Component(java.lang.String r1, java.util.Set<com.google.firebase.components.Qualified<? super T>> r2, java.util.Set<com.google.firebase.components.Dependency> r3, int r4, int r5, com.google.firebase.components.ComponentFactory<T> r6, java.util.Set<java.lang.Class<?>> r7) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r0.providedInterfaces = r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r3)
            r0.dependencies = r1
            r0.instantiation = r4
            r0.type = r5
            r0.factory = r6
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r7)
            r0.publishedEvents = r1
            return
    }

    /* synthetic */ Component(java.lang.String r1, java.util.Set r2, java.util.Set r3, int r4, int r5, com.google.firebase.components.ComponentFactory r6, java.util.Set r7, com.google.firebase.components.Component.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static <T> com.google.firebase.components.Component.Builder<T> builder(com.google.firebase.components.Qualified<T> r3) {
            com.google.firebase.components.Component$Builder r0 = new com.google.firebase.components.Component$Builder
            r1 = 0
            com.google.firebase.components.Qualified[] r1 = new com.google.firebase.components.Qualified[r1]
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component.Builder<T> builder(com.google.firebase.components.Qualified<T> r2, com.google.firebase.components.Qualified<? super T>... r3) {
            com.google.firebase.components.Component$Builder r0 = new com.google.firebase.components.Component$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> r3) {
            com.google.firebase.components.Component$Builder r0 = new com.google.firebase.components.Component$Builder
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> r2, java.lang.Class<? super T>... r3) {
            com.google.firebase.components.Component$Builder r0 = new com.google.firebase.components.Component$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.firebase.components.Component<T> intoSet(T r1, java.lang.Class<T> r2) {
            com.google.firebase.components.Component$Builder r2 = intoSetBuilder(r2)
            com.google.firebase.components.Component$$ExternalSyntheticLambda0 r0 = new com.google.firebase.components.Component$$ExternalSyntheticLambda0
            r0.<init>(r1)
            com.google.firebase.components.Component$Builder r1 = r2.factory(r0)
            com.google.firebase.components.Component r1 = r1.build()
            return r1
    }

    public static <T> com.google.firebase.components.Component.Builder<T> intoSetBuilder(java.lang.Class<T> r0) {
            com.google.firebase.components.Component$Builder r0 = builder(r0)
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.Builder.access$200(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$intoSet$3(java.lang.Object r0, com.google.firebase.components.ComponentContainer r1) {
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$1(java.lang.Object r0, com.google.firebase.components.ComponentContainer r1) {
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component<T> of(T r0, java.lang.Class<T> r1, java.lang.Class<? super T>... r2) {
            com.google.firebase.components.Component$Builder r1 = builder(r1, r2)
            com.google.firebase.components.Component$$ExternalSyntheticLambda1 r2 = new com.google.firebase.components.Component$$ExternalSyntheticLambda1
            r2.<init>(r0)
            com.google.firebase.components.Component$Builder r0 = r1.factory(r2)
            com.google.firebase.components.Component r0 = r0.build()
            return r0
    }

    public java.util.Set<com.google.firebase.components.Dependency> getDependencies() {
            r1 = this;
            java.util.Set<com.google.firebase.components.Dependency> r0 = r1.dependencies
            return r0
    }

    public com.google.firebase.components.ComponentFactory<T> getFactory() {
            r1 = this;
            com.google.firebase.components.ComponentFactory<T> r0 = r1.factory
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.util.Set<com.google.firebase.components.Qualified<? super T>> getProvidedInterfaces() {
            r1 = this;
            java.util.Set<com.google.firebase.components.Qualified<? super T>> r0 = r1.providedInterfaces
            return r0
    }

    public java.util.Set<java.lang.Class<?>> getPublishedEvents() {
            r1 = this;
            java.util.Set<java.lang.Class<?>> r0 = r1.publishedEvents
            return r0
    }

    public boolean isAlwaysEager() {
            r2 = this;
            int r0 = r2.instantiation
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean isEagerInDefaultApp() {
            r2 = this;
            int r0 = r2.instantiation
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean isValue() {
            r1 = this;
            int r0 = r1.type
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Component<"
            r0.<init>(r1)
            java.util.Set<com.google.firebase.components.Qualified<? super T>> r1 = r2.providedInterfaces
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ">{"
            r0.append(r1)
            int r1 = r2.instantiation
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = ", deps="
            r0.append(r1)
            java.util.Set<com.google.firebase.components.Dependency> r1 = r2.dependencies
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.google.firebase.components.Component<T> withFactory(com.google.firebase.components.ComponentFactory<T> r10) {
            r9 = this;
            com.google.firebase.components.Component r8 = new com.google.firebase.components.Component
            java.lang.String r1 = r9.name
            java.util.Set<com.google.firebase.components.Qualified<? super T>> r2 = r9.providedInterfaces
            java.util.Set<com.google.firebase.components.Dependency> r3 = r9.dependencies
            int r4 = r9.instantiation
            int r5 = r9.type
            java.util.Set<java.lang.Class<?>> r7 = r9.publishedEvents
            r0 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
