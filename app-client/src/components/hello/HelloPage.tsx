import { Suspense, useState } from "react";
import { HelloApi, HelloDTO } from "../../generated";
import { Loadable } from "../../utils/loadable";
import { HelloTemplate } from "./HelloTemplate";

function fetch() {
  return new HelloApi().v1HelloGet().then((res) => res.data);
}

export function HelloPage() {
  const [data] = useState(() => new Loadable(fetch()));

  return (
    <Suspense fallback={<p>Loading...</p>}>
      <SuspendedHello data={data} />
    </Suspense>
  );
}

type Props = {
  data: Loadable<HelloDTO>;
};
function SuspendedHello({ data }: Props) {
  const value = data.getOrThrow();
  return <HelloTemplate hello={value} />;
}
