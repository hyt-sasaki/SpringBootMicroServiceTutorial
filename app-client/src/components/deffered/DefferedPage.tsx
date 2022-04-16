import { useDeferredValue, useState } from "react";

export function DefferedPage() {
  const [text, setText] = useState("");

  const defferedText = useDeferredValue(text);

  return (
    <div>
      <input value={text} onChange={(e) => setText(e.currentTarget.value)} />
      <p>{defferedText}</p>
    </div>
  );
}
