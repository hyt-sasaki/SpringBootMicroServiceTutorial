import { Suspense, useState } from "react";
import { HelloApi, HelloDTO } from "../../generated";
import { useHello } from "../../hooks/useHello";
import { HelloTemplate } from "./HelloTemplate";

function fetch() {
  return new HelloApi().v1HelloGet().then((res) => res.data);
}

export function HelloPage() {
  return (
    <Suspense fallback={<p>Loading...</p>}>
      <SuspendedHello />
    </Suspense>
  );
}

function SuspendedHello() {
  const { data } = useHello();
  return <HelloTemplate hello={data} />;
}
